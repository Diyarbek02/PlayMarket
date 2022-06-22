package com.example.playmarket.ViewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.Adapter.ItemAdapter
import com.example.playmarket.ItemText
import com.example.playmarket.databinding.RecyclerView1Binding

class MainViewHolder(private val binding: RecyclerView1Binding) : RecyclerView.ViewHolder(binding.root){

        fun bind(itemList: List<ItemText>) {
            val itemAdapter = ItemAdapter()
            itemAdapter.models = itemList

            binding.rvMain.adapter = itemAdapter
        }
}