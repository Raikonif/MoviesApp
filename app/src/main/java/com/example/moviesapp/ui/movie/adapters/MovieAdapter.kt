package com.example.moviesapp.ui.movie.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviesapp.core.BaseViewHolder
import com.example.moviesapp.data.model.Movie
import com.example.moviesapp.databinding.MovieItemBinding


class MovieAdapter(
    private val movieList: List<Movie>,
    private val itemClickListener: OnMovieClickListener
) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    interface OnMovieClickListener {
        fun onMovieClick(movie: Movie)
    }
// nos da elementos de la lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val itemBinding = MovieItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        val holder = MoviesViewHolder(itemBinding, parent.context)
// click de cada elemento
        itemBinding.root.setOnClickListener {
            val position =
                holder.bindingAdapterPosition.takeIf {
                    it != DiffUtil.DiffResult.NO_POSITION
                } ?: return@setOnClickListener
            itemClickListener.onMovieClick(movieList[position])
        }
        return holder
    }
// cada elemento se implementa en pantalla
    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is MoviesViewHolder -> holder.bind(movieList[position])
        }
    }
// muestra la cantidad de elementos de una lista
    override fun getItemCount():
        Int = movieList.size

// pone imagen a cada elemento
    private inner class MoviesViewHolder(
        val binding: MovieItemBinding,
        val context: Context
    ) : BaseViewHolder<Movie>(binding.root) {
        override fun bind(item: Movie) {
            Glide.with(context)
                .load("https://image.tmdb.org/t/p/w500/${item.poster_path}")
                .centerCrop()
                .into(binding.imgMovie)
        }
    }
}