package com.example.jetpackcomposedtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.jetpackcomposedtask.Model.Car
import com.example.jetpackcomposedtask.Task2.CustomListScreen
import com.example.jetpackcomposedtask.Task2.FullScreenCarDetails
import com.example.jetpackcomposedtask.Task2.LoginPage
import com.example.jetpackcomposedtask.ui.theme.JetpackComposedTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposedTaskTheme {
                // State to manage navigation
                var currentScreen by remember { mutableStateOf("login") }
                // State to hold the selected car
                var selectedCar by remember { mutableStateOf<Car?>(null) }

                when (currentScreen) {
                    "login" -> {
                        LoginPage(onLoginSuccess = {
                            currentScreen = "custom_list"
                        })
                    }
                    "custom_list" -> {
                        CustomListScreen(onCarClick = { car ->
                            selectedCar = car
                            currentScreen = "details"
                        })
                    }
                    "details" -> {
                        selectedCar?.let { car ->
                            FullScreenCarDetails(
                                car = car,
                                onBack = { currentScreen = "custom_list" }
                            )
                        }
                        
                        // Handle system back button to go back to list
                        BackHandler {
                            currentScreen = "custom_list"
                        }
                    }
                }
            }
        }
    }
}
