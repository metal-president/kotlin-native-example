package com.example.kotlinnativeandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kmmsharedmodule.Greeting
import com.example.kotlinnativeandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.textView.text = Greeting().greeting()
        setContentView(binding.root)
    }
}