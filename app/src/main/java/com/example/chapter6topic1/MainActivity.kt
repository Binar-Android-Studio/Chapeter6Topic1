package com.example.chapter6topic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.chapter6topic1.databinding.ActivityMainBinding
import com.example.chapter6topic1.workers.BlurViewModel
import com.example.chapter6topic1.workers.BlurViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private val viewModel: BlurViewModel by viewModels { BlurViewModelFactory(application) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goButton.setOnClickListener{
            viewModel.applyBlur(1)
        }

    }
}