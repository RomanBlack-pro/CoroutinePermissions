package com.github.commontools.coroutinepermissions

import android.util.Log
import androidx.fragment.app.FragmentActivity

object Test {
    fun test(){
        Log.i("Test","I am a test")
    }
}

fun FragmentActivity.test2() =
        Log.i("Test","I am test2")