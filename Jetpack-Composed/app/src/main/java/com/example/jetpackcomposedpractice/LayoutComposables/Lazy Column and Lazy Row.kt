package com.example.jetpackcomposedpractice.LayoutComposables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Lazy Column
@Composable
fun LazyColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Lazy Column are used for large data sets like Recycerview or Listview in XML",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )

        LazyColumn(
            modifier = Modifier
                .height(350.dp) // Set height to 350dp as requested
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .background(color = Color.LightGray)
        ) {
            items(100) { index ->
                Text(
                    text = "Items $index in Lazy Column",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .background(color = Color.White)
                        .padding(16.dp)
                )
            }
        }
    }
}

// Lazy Row
@Composable
fun LazyRowExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Lazy Row is used for horizontal scrolling lists",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray)
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(100) { index ->
                Text(
                    text = "Item $index",
                    modifier = Modifier
                        .background(color = Color.White)
                        .padding(16.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyListPreview() {
    // You can switch between LazyColumnExample() and LazyRowExample() here
    // LazyColumnExample()
    LazyRowExample()
}
