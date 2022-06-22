package com.example.playmarket.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.ItemText
import com.example.playmarket.R
import com.example.playmarket.ViewHolder.MainViewHolder
import com.example.playmarket.databinding.RecyclerView1Binding

class MainAdapter: RecyclerView.Adapter<MainViewHolder>() {
    var models = listOf<List<ItemText>>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = models.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_1, parent, false)
        val binding = RecyclerView1Binding.bind(view)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(models[position])
    }
}