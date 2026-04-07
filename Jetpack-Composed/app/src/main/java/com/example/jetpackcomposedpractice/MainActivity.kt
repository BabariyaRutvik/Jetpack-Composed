package com.example.jetpackcomposedpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposedpractice.CoreComportants.AnnotatingStringWithListener
import com.example.jetpackcomposedpractice.CoreComportants.FilledButton
import com.example.jetpackcomposedpractice.CoreComportants.PartialSelectable
import com.example.jetpackcomposedpractice.CoreComportants.PasswordTextFiled
import com.example.jetpackcomposedpractice.CoreComportants.TonalButton
import com.example.jetpackcomposedpractice.ui.theme.JetpackComposedPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposedPracticeTheme {
                //PasswordTextFiled()
               // PartialSelectable()
               // AnnotatingStringWithListener()
                //FilledButton()
                TonalButton()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposedPracticeTheme {
        //PasswordTextFiled()
        //PartialSelectable()
        //AnnotatingStringWithListener()
        //FilledButton()
        TonalButton()
    }
}