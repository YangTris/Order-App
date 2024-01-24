package com.example.orderapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Lấy tham chiếu đến TextView từ layout
        val textViewPackageName: TextView = findViewById(R.id.textViewPackageName)

        // Gán giá trị cho TextView
        textViewPackageName.text = applicationContext.packageName
    }
}