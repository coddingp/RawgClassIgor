package com.example.rawgmy.main.ui

import com.example.rawgmy.common.mvp.BaseFragmentContract
import com.example.rawgmy.common.mvp.MvpPresenter
import com.example.rawgmy.common.mvp.MvpView
import com.example.rawgmy.model.MainItems

interface MainContract : BaseFragmentContract {
    interface View : MvpView {
        fun showGames(data: List<MainItems>)
    }

    interface Presenter : MvpPresenter<View> {
        fun getGames()
    }
}