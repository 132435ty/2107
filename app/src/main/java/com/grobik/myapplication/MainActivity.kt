package com.grobik.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val person = Name("Kirill", "Zaiakin")

        val nameTextView = findViewById<TextView>(R.id.textView)
        nameTextView.text = person.name
        val lastNameTextView = findViewById<TextView>(R.id.textView2)
        lastNameTextView.text = person.lastName
    }
}