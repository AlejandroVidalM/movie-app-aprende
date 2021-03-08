package com.example.aprende.api

import com.example.aprende.reponse.PopularMoviesResponse
import retrofit2.Response
import retrofit2.http.GET

interface TheMovieDBService {
    @GET("movie/popular")
    suspend fun getPopularMovies(): Response<PopularMoviesResponse>
}