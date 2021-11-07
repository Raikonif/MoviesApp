package com.example.moviesapp.repository

import com.example.moviesapp.data.local.LocalMovieDataSource
import com.example.moviesapp.data.model.MovieList
import com.example.moviesapp.data.remote.RemoteMovieDataSource

class MovieRepositoryImpl(
    private val dataSourceRemote: RemoteMovieDataSource,
    private val dataSourceLocal: LocalMovieDataSource
) : MovieRepository {
    override suspend fun getUpcomingMovies():
            MovieList = dataSourceRemote.getUpcomingMovies()

    override suspend fun getTopRatedMovies():
            MovieList = dataSourceRemote.getTopRatedMovies()

    override suspend fun getPopularMovies():
            MovieList = dataSourceRemote.getPopularMovies()

}