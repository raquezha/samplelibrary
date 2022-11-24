package net.nueca.sample_api_module

import android.util.Log

object SimpleAPIHelper {

    fun simpleApiCall(): String {
        Log.e("SimpleAPIHelper", "simple api call!")

        return "This is from sample-api-module"
    }

}