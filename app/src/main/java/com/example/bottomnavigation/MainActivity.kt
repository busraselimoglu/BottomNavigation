package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // bottom_nav_menu added 2 more items to improve the appearance
        bottomNavigationView.menu.getItem(1).isEnabled = false
        bottomNavigationView.menu.getItem(2).isEnabled = false

    }
}