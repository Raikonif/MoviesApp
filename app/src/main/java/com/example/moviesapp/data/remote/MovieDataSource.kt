package com.example.moviesapp.data.remote

import com.example.moviesapp.aplication.AppConstants
import com.example.moviesapp.data.model.MovieList
import com.example.moviesapp.repository.WebService


class MovieDataSource(private val webService: WebService ) {

    suspend fun getUpcomingMovies(): MovieList{
        return webService.getUpcomingMovies(AppConstants.API_KEY)
    }

    suspend fun getTopRatedMovies(): MovieList{
        return webService.getTopRatedMovies(AppConstants.API_KEY)
    }

    suspend fun getPopularMovies(): MovieList {
        return webService.getPopularMovies(AppConstants.API_KEY)
    }
}
