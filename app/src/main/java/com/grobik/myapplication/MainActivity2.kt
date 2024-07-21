package com.grobik.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.button2).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        val Job1 = Job("student")
        val job = findViewById<TextView>(R.id.textView3)
        job.text = Job1.job

        fun string(z: Int): String {
            return "Это значение: $z"
        }

        fun qwer() {
            for (i in 0 until 10) {
                val formatted = string(i)
                println(formatted)
            }
        }
        qwer()
    }
}
