package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.playmarket.databinding.ActivityMainBinding
import com.example.playmarket.fragment.AppsFragment
import com.example.playmarket.fragment.MainFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(MainFragment())
        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottom_navigation.setOnItemSelectedListener { item ->
            var fragment: Fragment
            when (item.itemId) {

                R.id.menu -> {
                    fragment = MainFragment()
                    loadFragment(fragment)
                    true
                }

                R.id.games -> {
                    fragment = AppsFragment()
                    loadFragment(fragment)
                    true
                }

                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
            .commit()
    }
}

