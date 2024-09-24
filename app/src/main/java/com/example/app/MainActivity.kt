package com.example.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.google.gson.Gson
import kotlin.reflect.cast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val inputJson = """
            {
              "make": "Toyota",
              "model": "Corolla",
              "year": 2022,
              "color": "Blue"
            }
        """.trimIndent()

        val tvSample = findViewById<TextView>(R.id.tv_sample)
        val car = Gson().fromJson(inputJson, Car::class.java)
        tvSample.text = car.make

    }
}

