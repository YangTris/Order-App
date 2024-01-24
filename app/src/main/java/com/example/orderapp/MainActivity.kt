package com.example.orderapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var PACKAGE_NAME: String
        PACKAGE_NAME = applicationContext.packageName
        println("Hello World")
        print("Package name: " + PACKAGE_NAME)
    }
}