package com.example.playmarket.ViewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.ItemText
import com.example.playmarket.databinding.Item1Binding

class ItemViewHolder(private val binding: Item1Binding): RecyclerView.ViewHolder(binding.root) {
    fun bind(itemText: ItemText){
        binding.tvItem.text = itemText.text
    }
}