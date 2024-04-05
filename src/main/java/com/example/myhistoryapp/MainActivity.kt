package com.example.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity()
{
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ClearButton = findViewById<TextView>(R.id.ClearButton)
        val NextButton = findViewById<TextView>(R.id.NextButton)
        val RandomizeButton = findViewById<Button>(R.id.RandomizeButton)
        val AgeTextView = findViewById<TextView>(R.id.AgeTextView)
        val ResultTextView = findViewById<TextView>(R.id.ResultTextView)

        NextButton.setOnClickListener {
            val ageString = AgeTextView.text.toString()
            if (ageString.isEmpty()) {
                ResultTextView.text = "Please enter an age"
            } else
            {
                val age = ageString.toIntOrNull()
                if (age == null)
                {
                    ResultTextView.text = "Please enter a valid age"
                } else {
                    if (age < 20 || age > 100)
                    {
                        ResultTextView.text = "Please enter a valid age between 20 to 100"
                        AgeTextView.text = null
                    } else
                    {
                        val result = when (age)
                        {
                            48 -> "Whitney Houston was a singer and actress"
                            40 -> "Paul Walker was an american actor"
                            43 -> "Chadwick Boseman was an american actor"
                            25 -> "Tupac Shakur was an american actor"
                            25 -> "Angus Cloud was an actor"
                            28 -> "Kirsnick Khari Ball was a famous rapper"
                            96 -> "Queen Elizabeth II was the queen of United Kingdom"
                            50 -> "Michael Jackson was a famous singer and dancer"
                            36 -> "AKA (Kiernan Jarryd Forbes was a South African Rapper"
                            40 -> "Stephen Boss was an american dancer and choreographer"

                            else -> "No one died at this age, try a different one!"
                        }
                        ResultTextView.text = result
                    }
                }
            }
        }

        ClearButton.setOnClickListener {
            AgeTextView.text = null
            ResultTextView.text = ""
        }}}