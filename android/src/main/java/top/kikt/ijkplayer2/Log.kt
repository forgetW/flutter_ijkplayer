package top.kikt.ijkplayer2

import android.util.Log

var showLog = true

fun Any.logi(any: Any?) {
    if (showLog) {
        Log.i(this::class.java.simpleName, any.toString())
    }
}