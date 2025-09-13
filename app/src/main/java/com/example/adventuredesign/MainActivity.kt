package com.example.adventuredesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.adventuredesign.ui.theme.AdventuredesignTheme
import UI.MyAppScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdventuredesignTheme {
                MyAppScreen()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MyAppScreenPreview() {
    AdventuredesignTheme {
        MyAppScreen()
    }
}