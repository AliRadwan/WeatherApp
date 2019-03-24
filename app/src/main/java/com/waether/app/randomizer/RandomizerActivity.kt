package com.waether.app.randomizer

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.waether.app.R
import com.waether.app.core.ContentViewId
import kotlinx.android.synthetic.main.activity_randomizer.*

@ContentViewId(R.layout.activity_randomizer)
class RandomizerActivity : FragmentActivity() {


    private val viewModel by lazy {
        ViewModelProviders.of(this).get(RandomizerViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.numberLiveData.observe(this,
            Observer { random_number_textView.text = it.toString() })

        increment_button.setOnClickListener {
            viewModel.incrementNumber()
        }
    }
}
