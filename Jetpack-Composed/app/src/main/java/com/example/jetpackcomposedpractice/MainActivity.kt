package com.example.jetpackcomposedpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposedpractice.FundamentalConcept.AccessColorResource
import com.example.jetpackcomposedpractice.FundamentalConcept.AccessStringRes
import com.example.jetpackcomposedpractice.ui.theme.JetpackComposedPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposedPracticeTheme {
               // AccessStringRes()
                AccessColorResource()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposedPracticeTheme {
        //AccessStringRes()
        AccessColorResource()

    }
}
