package com.example.flowobjectrepro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flowobjectrepro.ui.theme.R8FullModeReproTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fruit: Fruit = Fruit.Cherry
        when (fruit) {
            Fruit.Apple -> println("I am Apple")
            Fruit.Apricot -> println("I am Apricot")
            Fruit.Avocado -> println("I am Avocado")
            Fruit.Banana -> println("I am Banana")
            Fruit.Blackberry -> println("I am Blackberry")
            Fruit.Blackcurrant -> println("I am Blackcurrant")
            Fruit.Blueberry -> println("I am Blueberry")
            Fruit.Boysenberry -> println("I am Boysenberry")
            Fruit.Cantaloupe -> println("I am Cantaloupe")
            Fruit.Cherry -> println("I am Cherry")
            Fruit.Clementine -> println("I am Clementine")
            Fruit.Cranberry -> println("I am Cranberry")
            Fruit.Date -> println("I am Date")
            Fruit.DragonFruit -> println("I am DragonFruit")
            Fruit.Elderberry -> println("I am Elderberry")
            Fruit.Feijoa -> println("I am Feijoa")
            Fruit.Fig -> println("I am Fig")
            Fruit.Gooseberry -> println("I am Gooseberry")
            Fruit.Grapefruit -> println("I am Grapefruit")
            Fruit.Grapes -> println("I am Grapes")
            Fruit.Guava -> println("I am Guava")
            Fruit.Honeydew -> println("I am Honeydew")
            Fruit.Jackfruit -> println("I am Jackfruit")
            Fruit.Kiwi -> println("I am Kiwi")
            Fruit.Kiwifruit -> println("I am Kiwifruit")
            Fruit.Lemon -> println("I am Lemon")
            Fruit.Lime -> println("I am Lime")
            Fruit.Lychee -> println("I am Lychee")
            Fruit.Mango -> println("I am Mango")
            Fruit.Mulberry -> println("I am Mulberry")
            Fruit.Nectarine -> println("I am Nectarine")
            Fruit.Olive -> println("I am Olive")
            Fruit.Orange -> println("I am Orange")
            Fruit.Papaya -> println("I am Papaya")
            Fruit.PassionFruit -> println("I am PassionFruit")
            Fruit.Peach -> println("I am Peach")
            Fruit.Pear -> println("I am Pear")
            Fruit.Persimmon -> println("I am Persimmon")
            Fruit.Pineapple -> println("I am Pineapple")
            Fruit.Plum -> println("I am Plum")
            Fruit.Pomegranate -> println("I am Pomegranate")
            Fruit.Pomelo -> println("I am Pomelo")
            Fruit.Quince -> println("I am Quince")
            Fruit.Raspberry -> println("I am Raspberry")
            Fruit.StarFruit -> println("I am StarFruit")
            Fruit.Strawberry -> println("I am Strawberry")
            Fruit.Tangerine -> println("I am Tangerine")
            Fruit.UgliFruit -> println("I am UgliFruit")
            Fruit.Watermelon -> println("I am Watermelon")
        }

        setContent {
            R8FullModeReproTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize().padding(20.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(lineHeight = 20.sp, text = fruit.toString(), fontSize = 20.sp)
                    }
                }
            }
        }
    }
}

