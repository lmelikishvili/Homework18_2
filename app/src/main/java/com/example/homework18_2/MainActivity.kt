package com.example.homework18_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework18_2.databinding.ActivityMainBinding
import com.example.homework18_2.databinding.FragmentUserBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}