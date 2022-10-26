package com.example.aplikacja2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aplikacja2.R.id.button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            findViewById<Button>(R.id.button).text = "Przycisk klikniety!"

        }

        findViewById<Button>(R.id.button2).setOnClickListener {

            findViewById<Button>(R.id.button2).text = "Przycisk klikniety!"

        }
    }
}