package com.example.rawgmy.root

import android.os.Bundle
import com.example.rawgmy.R
import com.example.rawgmy.common.mvp.BaseActivity
import com.example.rawgmy.main.ui.MainFragment

class RootActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeFragment(MainFragment(), R.id.contentContainer)
    }
}