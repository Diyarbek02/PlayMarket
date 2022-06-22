package com.example.playmarket.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.playmarket.ItemText
import com.example.playmarket.Adapter.MainAdapter
import com.example.playmarket.R
import com.example.playmarket.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private val itemLists = mutableListOf<List<ItemText>>()
    private lateinit var binding: FragmentMainBinding
    private val adapter = MainAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainBinding.bind(view)

        fillList()
        adapter.models = itemLists

        binding.rvMain.adapter = adapter
    }

    private fun fillList() {
        repeat(6) { i ->
            val t = mutableListOf<ItemText>()
            repeat(10) { j ->
                t.add(ItemText("Item ${(i * 10) + (j + 1)}"))
            }
            itemLists.add(t)
        }
    }
}