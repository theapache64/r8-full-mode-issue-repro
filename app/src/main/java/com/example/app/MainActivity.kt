package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity


class Audi(val name: String, val year: Int, val newParam : Double)
class BMW(val name: String, val year: Int)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("BMW: ${BMW("X3", 2024)}")
        println("Audi: ${Audi("Q3", 2024, 0.5f)}")
    }
}

