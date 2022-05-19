package com.example.rawgmy.main.ui

import com.example.rawgmy.common.mvp.BasePresenter
import com.example.rawgmy.main.interactor.MainInteractor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class MainPresenter(
    private val interactor: MainInteractor
) : BasePresenter<MainContract.View>(),
    MainContract.Presenter {

    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override fun getGames() {
        presenterScope.launch {
            try {
                val data = interactor.getGames()
                view?.showGames(data)
            } catch (t: Throwable) {
                Timber.e("Error no games data -> ${t.message}")
            }
        }
    }

}