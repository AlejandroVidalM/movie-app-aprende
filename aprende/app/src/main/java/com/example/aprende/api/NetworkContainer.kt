package com.example.aprende.api

import com.example.aprende.common.Constantes
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkContainer {

    private val TheMovieDBInterceptor = TheMovieDBInterceptor()
    private val okHttpClient:OkHttpClient = with(OkHttpClient.Builder()){
        addInterceptor(TheMovieDBInterceptor)
        build()
    }

    val theMovieDBService: TheMovieDBService = Retrofit.Builder()
            .baseUrl(Constantes.API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(TheMovieDBService::class.java)
}