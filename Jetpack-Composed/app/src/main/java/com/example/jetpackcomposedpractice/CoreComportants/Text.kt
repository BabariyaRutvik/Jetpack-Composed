package com.example.jetpackcomposedpractice.CoreComportants

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposedpractice.R

// text
@Composable
fun SimpleText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
        ){
        Text(text = "Hello Rutvik Babariya",
            color = colorResource(R.color.red),
            fontSize = 35.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(shadow = Shadow(Color.Magenta,blurRadius = 50f))
        )
    }
}

@Composable
fun ColorText(){
    val rainbowColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Blue,
        Color.Green,
        Color.Magenta,
        Color.Cyan,
        Color.Red
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                append("Rutvik Babariya Learning Jetpack Compose \n")
                withStyle(SpanStyle(brush = Brush.linearGradient(colors = rainbowColors)))
                {
                    append("Rutvik Babariya")
                }
                append(" Learning Jetpack Compose")
            },
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun ScrollableText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Text(
            text = "Hello Rutvik Babariya Learning Jetpack Compose ".repeat(50),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            fontSize = 50.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextView(){
    //SimpleText()
    //ColorText()
    ScrollableText()
}