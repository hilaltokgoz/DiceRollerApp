package com.dicerollerapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicerollerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

 //   @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //layout'un bağlandığı yer

        binding.rollButton.setOnClickListener {
            rollDice()
            //binding.resultText.text=randomNumber.toString()
        }
    }

    private fun rollDice() {
        //Toast.makeText(this,"Button Clicked!",Toast.LENGTH_LONG).show() //context->ekranı işaret ettiğin yapı.

        val randomNumber=(1..6).random()
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceImage.setImageResource(drawableResource)
        binding.resultText.text=randomNumber.toString()
    }
}