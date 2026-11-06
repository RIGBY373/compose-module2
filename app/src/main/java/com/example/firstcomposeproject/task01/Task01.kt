package com.example.firstcomposeproject.task01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Hello(name: String?) {
    Text(
        text = if (name != null) "Привет, $name!" else "Имя не задано",
        modifier = Modifier.padding(16.dp)
    )
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hello("Анна")   // вариант 1: конкретное имя
            // Hello(null)  // вариант 2: имя не задано
        }
    }
}
