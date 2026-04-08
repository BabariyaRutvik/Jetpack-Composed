package com.example.jetpackcomposedpractice.LayoutComposables

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Modifiers are used in Compose to modify the appearance or behavior of UI elements.
// Order of modifiers matters!
@Composable
fun ModifierExample() {
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello Modifier!",
            modifier = Modifier
                // 1. Shadow (elevation)
                .shadow(elevation = 8.dp, shape = RoundedCornerShape(16.dp))
                // 2. Background color
                .background(color = Color.Yellow, shape = RoundedCornerShape(16.dp))
                // 3. Border
                .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(16.dp))
                // 4. Clip (cuts the content to the shape)
                .clip(RoundedCornerShape(16.dp))
                // 5. Clickable behavior
                .clickable {
                    Toast.makeText(context, "Text Clicked!", Toast.LENGTH_SHORT).show()
                }
                // 6. Padding (Inner spacing)
                .padding(32.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ModifierExamplePreview() {
    ModifierExample()
}
