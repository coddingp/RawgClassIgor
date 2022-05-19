package com.example.rawgmy.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rawgmy.R
import com.example.rawgmy.common.mvp.BaseFragmentMvp
import com.example.rawgmy.databinding.FragmentMainBinding
import com.example.rawgmy.main.ui.adapter.MainAdapter
import com.example.rawgmy.model.MainItems
import org.koin.android.ext.android.inject
import timber.log.Timber

class MainFragment() :
    BaseFragmentMvp<MainContract.View, MainContract.Presenter>(R.layout.fragment_main),
    MainContract.View {

    private lateinit var binding: FragmentMainBinding
    override val presenter: MainContract.Presenter by inject()

    private val adapter: MainAdapter by lazy {
        MainAdapter()
    }

    private val linearLayoutManager: LinearLayoutManager by lazy {
        LinearLayoutManager(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            recyclerView.layoutManager = linearLayoutManager
            recyclerView.adapter = adapter
            val data = presenter.getGames()
            Timber.tag("________________").i("DATA -> $data")
        }
    }

    override fun showGames(data: List<MainItems>) {
        adapter.setItems(data)
    }

}