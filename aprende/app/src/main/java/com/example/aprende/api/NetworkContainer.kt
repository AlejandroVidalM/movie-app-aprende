package com.example.aprende.api

import com.example.aprende.common.Constantes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkContainer {

    val theMovieDBService: TheMovieDBService = Retrofit.Builder()
        .baseUrl(Constantes.API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(TheMovieDBService::class.java)
}