package com.bigaton.hogwarts.ui.main


import android.os.Bundle
import com.bigaton.hogwarts.R
import com.bigaton.hogwarts.base.BaseActivity
import com.bigaton.hogwarts.databinding.ActivityMainBinding
import com.bigaton.hogwarts.ui.detail.DetailActivity.Companion.startActivityWithTransition

class MainActivity : BaseActivity() {

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            lifecycleOwner = this@MainActivity
            adapter = MainAdapter { view, type ->
                startActivityWithTransition(this@MainActivity, view, type)
            }
        }
    }

}