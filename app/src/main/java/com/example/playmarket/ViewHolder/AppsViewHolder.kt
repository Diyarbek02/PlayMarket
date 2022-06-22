package com.example.playmarket.ViewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.Adapter.AppItemAdapter
import com.example.playmarket.FrAppsItemText
import com.example.playmarket.databinding.RecyclerView2Binding

class AppsViewHolder(private val binding: RecyclerView2Binding): RecyclerView.ViewHolder(binding.root) {

    fun bind(itemList: List<FrAppsItemText>){
        val appItemAdapter = AppItemAdapter()
        appItemAdapter.models = itemList

        binding.rvApps.adapter = appItemAdapter
    }
}