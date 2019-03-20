package com.example.usecases

import android.os.CountDownTimer

/**
 * when we put number in code i's called Magic number and this is wrong way to write code
 * the beast way is to put it in a var and call it when you need
 */
private const val FINISH_AFTER_MILLIS = 10 * 60000L
private const val INTERVAL_IN_MILLIS = 1000L


// we can uses this ticker with RX

/**
 *  [() -> Unit] this is mean lambda expression and we use it if we have an interface with
 *  only one line [we didn't need to create a class and implement this interface lambda help us to skip this]
 */
class Ticker(private val onTicking: () -> Unit) : CountDownTimer(FINISH_AFTER_MILLIS, INTERVAL_IN_MILLIS){

    override fun onTick(millisUntilFinished: Long) {
        onTicking()
    }

    override fun onFinish() {
    }
}