package com.example.viewmodelpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelpractice.databinding.ActivityMainBinding
import com.example.viewmodelpractice.viewmodel.testViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: testViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(testViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            binding.tvtextview.text=it.toString()

        })

        increamentText()
        decrementText()
    }

    private fun increamentText(){
       binding.btnbutton.setOnClickListener{
            viewModel.currentNumber.value=++viewModel.number
        }
    }

    private fun decrementText(){
        binding.button2.setOnClickListener{
            viewModel.currentNumber.value=--viewModel.number
        }
    }
}