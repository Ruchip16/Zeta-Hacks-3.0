package com.zeta.zetafintech.network

//import com.facebook.stetho.okhttp3.StethoInterceptor
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.zeta.zetafintech.helpers.AppConstants
import com.zeta.zetafintech.network.ApiService
import com.zeta.zetafintech.network.ChainInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object WebService {

    private val httpClient: OkHttpClient = OkHttpClient
        .Builder()
        .addInterceptor(ChainInterceptor())
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
//        .addNetworkInterceptor(StethoInterceptor())
        .build()

    private val moshiBuilder: Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .client(httpClient)
        .baseUrl(AppConstants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshiBuilder))
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)

}