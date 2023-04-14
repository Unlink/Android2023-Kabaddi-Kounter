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

        binding.scoreA.text = viewModel.scoreA.toString()
        binding.scoreB.text = viewModel.scoreB.toString()

        binding.buttonTeamA1.setOnClickListener {
            viewModel.incrementScoreA()
            binding.scoreA.text = viewModel.scoreA.toString()
        }

        binding.buttonTeamA2.setOnClickListener {
            viewModel.incrementScoreA(2)
            binding.scoreA.text = viewModel.scoreA.toString()
        }

        binding.buttonTeamB1.setOnClickListener {
            viewModel.incrementScoreB()
            binding.scoreB.text = viewModel.scoreB.toString()
        }

        binding.buttonTeamB2.setOnClickListener {
            viewModel.incrementScoreB(2)
            binding.scoreB.text = viewModel.scoreB.toString()
        }

        binding.buttonReset.setOnClickListener {
            viewModel.reset()
            binding.scoreA.text = viewModel.scoreA.toString()
            binding.scoreB.text = viewModel.scoreB.toString()
        }
    }
}