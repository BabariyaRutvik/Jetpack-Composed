package com.example.jetpackcomposedpractice.CoreComportants

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposedpractice.R


@Composable
fun ImageComponent(){

    val imageColor = remember {
        Brush.sweepGradient(listOf(
            Color.Red,
            Color.Yellow,
            Color.Green,
            Color.Cyan,
            Color.Blue,
            Color.Magenta,
            Color.Red
        ))
    }
    // Set to 3.dp as requested
    val borderWidth = 3.dp

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter){

        Image(
            painter = painterResource(id = R.drawable.bmw_wal), 
            contentDescription = "BMW",
            modifier = Modifier
                .padding(top = 20.dp)
                .size(300.dp)
                .border(
                    width = borderWidth,
                    brush = imageColor, // Using your gradient brush
                    shape = CircleShape
                )
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter,
            // Applying saturation. (Note: Saturation uses a float value, 3f for high saturation)
            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ImagePreview(){
    ImageComponent()
}
