package com.calvinlsliang.guesstheanimal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.calvinlsliang.guesstheanimal.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.animal_cell.view.*

class AnimalsAdapter : RecyclerView.Adapter<AnimalsViewHolder>() {

    var animals = listOf<String>()
        set(value) { field = value.chunked(4).get(0) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_cell, parent, false)
        return AnimalsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        holder.bind(animals.get(position))
    }

    override fun getItemCount(): Int {
        return animals.count()
    }
}

class AnimalsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(animal: String) {
        Picasso.get()
                .load(animal)
                .error(R.mipmap.ic_launcher)
                .centerCrop()
                .fit()
                .into(itemView.animal_image)
    }
}
