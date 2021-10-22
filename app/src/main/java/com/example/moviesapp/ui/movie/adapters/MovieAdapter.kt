package com.example.moviesapp.ui.movie.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviesapp.core.BaseViewHolder
import com.example.moviesapp.data.model.Movie
import com.example.moviesapp.databinding.MovieItemBinding

class MovieAdapter: RecyclerView.Adapter<BaseViewHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val itemBinding = MovieItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)


        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    private inner class MoviesViewHolder(
        val binding: MovieItemBinding,
        val context: Context
    ):
        BaseViewHolder<Movie>(binding.root){
        override fun bind(item: Movie) {
            Glide.with(context)
        }
        }

}