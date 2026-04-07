package com.example.jetpackcomposedpractice.CoreComportants

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleOutlinedText(){
    var name by remember {
        mutableStateOf("")
    }
    val colors = listOf(
        Color.Red,
        Color.Green,
        Color.Blue,
        Color.Yellow,
        Color.Magenta,
        Color.Cyan,
        Color.Red
    )
    var email by rememberSaveable {
        mutableStateOf("")
    }
    
    // 1. Added '=' instead of 'by' because Brush is not a State object.
    // 2. Added Brush.linearGradient inside the block.
    val brush = remember {
        Brush.linearGradient(colors = colors)
    }

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
//        OutlinedTextField(value = name, onValueChange = {name = it},
//            label = {Text("Enter Your Name")})

        TextField(
            value = email, 
            onValueChange = { email = it },   
            textStyle = TextStyle(brush = brush),
            label = { Text("Enter Email") }
        )
    }

}
// text filed with password
@Composable
fun PasswordTextFiled(){
    var password by rememberSaveable {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Enter Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
    }
}

@Preview(showSystemUi = true)
@Composable
fun SimpleOutlinedTextPreview(){
    //SimpleOutlinedText()
    PasswordTextFiled()
}