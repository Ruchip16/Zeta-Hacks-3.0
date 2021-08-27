package com.zeta.zetafintech.network

import android.util.Log
import okhttp3.*

class ChainInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        Log.e("ChainReq", chain.request().url.toString())
        return chain.proceed(chain.request())
    }
}