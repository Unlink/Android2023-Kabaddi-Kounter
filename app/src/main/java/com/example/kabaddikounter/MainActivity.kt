package com.example.kabaddikounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.kabaddikounter.databinding.ActivityMainBinding
import com.example.kabaddikounter.viewModels.ScoreViewModel


class MainActivity : AppCompatActivity() {

    val viewModel: ScoreViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}