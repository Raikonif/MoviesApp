package com.example.moviesapp.ui.movie.adapters.concat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.core.BaseConcatHolder
import com.example.moviesapp.databinding.PopularMoviesRowBinding
import com.example.moviesapp.databinding.TopRatedMoviesBinding
import com.example.moviesapp.ui.movie.adapters.MovieAdapter

class TopRatedConcatAdapter (private val movieAdapter: MovieAdapter) : RecyclerView.Adapter<BaseConcatHolder<*>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseConcatHolder<*> {
        val itemBinding = TopRatedMoviesBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ConcatViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: BaseConcatHolder<*>, position: Int) {
        when(holder){
            is ConcatViewHolder -> holder.bind(movieAdapter)
        }
    }

    override fun getItemCount():
            Int = 1

    private inner class ConcatViewHolder(val binding: TopRatedMoviesBinding) :
        BaseConcatHolder<MovieAdapter>(binding.root) {
        override fun bind(adapter: MovieAdapter) {
            binding.rvTopRatedMovies.adapter = adapter
        }
    }
}