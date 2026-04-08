package com.example.jetpackcomposedpractice.LayoutComposables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

// 1. Column layout its allow us to place items in a vertical sequence.
@Composable
fun ColumnLayout(){
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Text 1", color = Color.White)
        Text(text = "Text 2", color = Color.White)
        Text(text = "Text 3", color = Color.White)
        Text(text = "Text 4", color = Color.White)
        Text(text = "Text 5", color = Color.White)
    }
}

// 2. Row layout and its allow us to place items in a horizontal sequence.
@Composable
fun RowLayout(){
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Text 1", color = Color.White)
        Text(text = "Text 2", color = Color.White)
        Text(text = "Text 3", color = Color.White)
        Text(text = "Text 4", color = Color.White)
        Text(text = "Text 5", color = Color.White)
    }
}

// 3. Box layout and its allow us to place items in a horizontal and vertical sequence.
@Composable
fun BoxLayout(){
    Box(modifier = Modifier.size(200.dp).background(color = Color.Red),
        contentAlignment = Alignment.Center,
        ){
        Box(modifier = Modifier.size(100.dp).background(color = Color.Magenta))
    }
}

// 4. Constraints layout main layout
@Composable
fun ConstraintsLayoutpre(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()
        .background(color = Color.DarkGray)){

        val (text1, text2, text3, text4, text5) = createRefs()

        Text("Top Left",
            color = Color.White,
            modifier = Modifier.constrainAs(text1) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
            })

        Text("Center",
            color = Color.White,
            modifier = Modifier.constrainAs(text2) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

        Text("Bottom Right",
            color = Color.White,
            modifier = Modifier.constrainAs(text3) {
                bottom.linkTo(parent.bottom, margin = 16.dp)
                end.linkTo(parent.end, margin = 16.dp)
            })

        Text("Bottom Left",
            color = Color.White,
            modifier = Modifier.constrainAs(text4) {
                bottom.linkTo(parent.bottom, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
            })

        Text("Top End",
            color = Color.White,
            modifier = Modifier.constrainAs(text5) {
                top.linkTo(parent.top, margin = 16.dp)
                end.linkTo(parent.end, margin = 16.dp)
            })
    }
}

// preview for the visible the design
@Preview(showBackground = true)
@Composable
fun ColumnLayoutPreview(){
    //ColumnLayout()
    //RowLayout()
    //BoxLayout()
    ConstraintsLayoutpre()
}
