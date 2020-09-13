package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.

        // Using the id given in the layout file you can access the component.
        // Set an action when the user clicks on the confirm button.
        binding.submit.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val answer1 = binding.input1.text.toString()
        val answer2 = binding.input2.text.toString()
        val answer3 = binding.input3.text.toString()
        val answer4 = binding.input4.text.toString()


        if (answer1 == getString(R.string.trueAnswer)) {
            if (answer2 == getString(R.string.falseAnswer))
                if (answer3 == getString(R.string.falseAnswer))
                    if (answer4 == getString(R.string.falseAnswer)) {
                        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG)
                            .show()
                    }
        }


    }
}