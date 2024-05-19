package com.metech.kotlinyp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.metech.kotlinyp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val num1 = binding.firstNum.text
        val num2 = binding.secondNum.text

        binding.plusBtn.setOnClickListener {
            val sum = num1.toString().toDouble() + num2.toString().toDouble()
            binding.answer.text = "The sum of $num1 and $num2 is $sum"
        }
        binding.minusBtn.setOnClickListener {
            val sum = num1.toString().toDouble() - num2.toString().toDouble()
            binding.answer.text = "The different of $num1 and $num2 is $sum"
        }
        binding.multiplyBtn.setOnClickListener {
            val sum = num1.toString().toDouble() * num2.toString().toDouble()
            binding.answer.text = "The multiply of $num1 and $num2 is $sum"
        }
        binding.divideBtn.setOnClickListener {
            val sum = num1.toString().toDouble() / num2.toString().toDouble()
            binding.answer.text = "The divide of $num1 and $num2 is $sum"
        }



    }
}