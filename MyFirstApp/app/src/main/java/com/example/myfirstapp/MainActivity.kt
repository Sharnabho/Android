package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val textViewer = findViewById<TextView>(R.id.textView)
        var count = 0
        btnClickMe.setOnClickListener {
            count += 1
            textViewer.text = count.toString()
            Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()
        }
    }
}