package com.example.sportstrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import com.example.sportstrainer.databinding.ActivityMainBinding
import com.example.sportstrainer.ui.viewmodel.MainViewModel
import kotlinx.coroutines.flow.collectLatest

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            viewModel.triggerStateFlow()
        }

        subscribeToObservables()
    }

    private fun subscribeToObservables() {
        lifecycleScope.launchWhenStarted {
            viewModel.stateFlow.collectLatest {
                binding.textView.text = it
            }
        }
    }
}