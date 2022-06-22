package com.example.playmarket.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.playmarket.Adapter.AppsAdapter
import com.example.playmarket.FrAppsItemText
import com.example.playmarket.R
import com.example.playmarket.databinding.FragmentAppsBinding

class AppsFragment : Fragment(R.layout.fragment_apps) {
    private val itemLists = mutableListOf<List<FrAppsItemText>>()
    private lateinit var binding: FragmentAppsBinding
    private val adapter = AppsAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAppsBinding.bind(view)

        fillList()
        adapter.models = itemLists

        binding.rvApps.adapter = adapter
    }

    private fun fillList(){
        repeat(6){ i ->
            val t = mutableListOf<FrAppsItemText>()
            repeat(10){ j ->
                t.add(FrAppsItemText("Item ${(i *10) + (j + 1)}"))
            }
            itemLists.add(t)
        }
    }
}