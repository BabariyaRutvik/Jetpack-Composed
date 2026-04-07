package com.example.jetpackcomposedpractice.CoreComportants

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

// 1. Filled button
@Composable
fun FilledButton(){
    val context = LocalContext.current
    
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { 
            Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Filled Button")
        }
    }
}
// 2. Tonal Button
@Composable
fun TonalButton(){
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        FilledTonalButton(onClick = {
            Toast.makeText(context, "Tonal Button Clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Tonal Button")
        }
    }
}
// 3. Outline Button
@Composable
fun OutlineButton(){
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        OutlinedButton(onClick = {
            Toast.makeText(context, "Outline Button Clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Outline Button")
        }
    }
}
// 4. Elivated Button
@Composable
fun ElevatedButton(){
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        ElevatedButton(onClick = {
            Toast.makeText(context, "Elevated Button Clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Elevated Button")
        }
    }
}
// 5. Text Button
@Composable
fun TextButton() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        TextButton(onClick = {
            Toast.makeText(context, "Text Button Clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Text Button")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonPreview() {
    // FilledButton()
    // TonalButton()
    // OutlineButton()
    // ElevatedButton()
    TextButton()
}