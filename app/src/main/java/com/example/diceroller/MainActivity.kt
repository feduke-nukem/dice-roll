package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var diceImages =
        listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // New binding approach
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val newSrc = diceImages[Random.nextInt(6)]
        binding.diceImage.setImageResource(newSrc)
    }
}