package com.example.textviewtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCountDisplayView = findViewById<TextView>(R.id.buttonName)
        val clickMeButton1 = findViewById<TextView>(R.id.button1)
        val clickMeButton2 = findViewById<TextView>(R.id.button2)
        val clickMeButton3 = findViewById<TextView>(R.id.button3)


        clickMeButton1.setOnClickListener {

            buttonCountDisplayView.setText("Red was Clicked")
        }
        clickMeButton2.setOnClickListener {

            buttonCountDisplayView.setText("Green was Clicked")
        }
        clickMeButton3.setOnClickListener {

            buttonCountDisplayView.setText("Blue was Clicked")
        }
    }
}