package com.example.bankaum.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bankaum.R
import kotlinx.android.synthetic.main.activity_screen.*


class Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)

        bottomNavigationView.setupWithNavController(findNavController(R.id.navHostFragment))
    }
}