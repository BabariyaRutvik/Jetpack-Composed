package com.example.jetpackcomposedtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.jetpackcomposedtask.Task2.CustomListScreen
import com.example.jetpackcomposedtask.Task2.LoginPage
import com.example.jetpackcomposedtask.ui.theme.JetpackComposedTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposedTaskTheme {
                // This state variable controls which screen is visible
                var currentScreen by remember { mutableStateOf("login") }

                if (currentScreen == "login") {
                    LoginPage(onLoginSuccess = {
                        // When login is successful, we change the state
                        currentScreen = "custom_list"
                    })
                } else {
                    // Compose automatically switches to this when currentScreen changes
                    CustomListScreen()
                }
            }
        }
    }
}
