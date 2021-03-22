package com.bachelor.cv3vamz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollDice: Button = findViewById(R.id.button)
        rollDice.setOnClickListener {
            val textView: TextView = findViewById(R.id.textview1)
            textView.text = (1..8).random().toString()
        }

    }
}



