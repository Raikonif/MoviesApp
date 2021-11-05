package com.example.moviesapp.data.local

import com.example.moviesapp.aplication.AppConstants
import com.example.moviesapp.data.model.MovieEntity
import com.example.moviesapp.data.model.MovieList
import com.example.moviesapp.data.model.toMovieList
import com.example.moviesapp.repository.WebService

class LocalMovieDataSource (private val movieDao: MovieDao) {

    suspend fun getUpcomingMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movie_type == "upcoming" }.toMovieList()
    }

    suspend fun getTopRatedMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movie_type == "top_rated" }.toMovieList()
    }

    suspend fun getPopularMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movie_type == "popular" }.toMovieList()
    }

    suspend fun saveMovie(movie: MovieEntity){
        movieDao.saveMovie(movie)
    }
}