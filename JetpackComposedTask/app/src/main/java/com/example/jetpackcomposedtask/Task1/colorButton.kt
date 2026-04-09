package com.example.jetpackcomposedtask.Task1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.jetpackcomposedtask.R


@Composable
fun ButtonColor(){


    // Main screen background color as a white
    val backgroundColor = remember { mutableStateOf(R.color.white) }

    // constrains layout
    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = backgroundColor.value))
        .safeDrawingPadding()
        .padding(16.dp)) {

        // created a references for all buttons
        val (btnRed, btnBlue, btnTeal, btnYellow, btnMagenta) = createRefs()

        // 1. Red button top left
        Button(
            onClick = { backgroundColor.value = R.color.red },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (backgroundColor.value == R.color.red) Color.White else Color.Red,
                contentColor = if (backgroundColor.value == R.color.red) Color.Red else Color.White
            ),
            modifier = Modifier.constrainAs(btnRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        ) {
            Text("Red")
        }
        // 2. Blue button top right
        Button(onClick = {backgroundColor.value = R.color.blue},
            colors = ButtonDefaults.buttonColors(
                containerColor = if (backgroundColor.value == R.color.blue) Color.White else Color.Blue,
                contentColor = if (backgroundColor.value == R.color.blue) Color.Blue else Color.White
            ),
            modifier = Modifier.constrainAs(btnBlue){
                top.linkTo(parent.top)
                end.linkTo(parent.end)

            }) {
            Text("Blue")

        }
        // 3. Teal button center
        Button(onClick = {backgroundColor.value = R.color.teal},
            colors = ButtonDefaults.buttonColors(
                containerColor = if (backgroundColor.value == R.color.teal) Color.White else colorResource(id = R.color.teal),
                contentColor = if (backgroundColor.value == R.color.teal) colorResource(id = R.color.teal) else Color.White
            ),
            modifier = Modifier.constrainAs(btnTeal){
                centerTo(parent)
            }) {
            Text("Teal")

        }
        // 4. Yellow button bottom left
        Button(onClick = {backgroundColor.value = R.color.yellow},
            colors = ButtonDefaults.buttonColors(
                containerColor = if (backgroundColor.value == R.color.yellow) Color.White else Color.Yellow,
                contentColor = if (backgroundColor.value == R.color.yellow) Color.Yellow else Color.Black
            ), modifier = Modifier.constrainAs(btnYellow){
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
            }) {
            Text("Yellow")
        }
        // 5. Magenta button bottom right
        Button(onClick = {backgroundColor.value = R.color.magenta},
            colors = ButtonDefaults.buttonColors(
                containerColor = if (backgroundColor.value == R.color.magenta) Color.White else Color.Magenta,
                contentColor = if (backgroundColor.value == R.color.magenta) Color.Magenta else Color.White

            ),
            modifier = Modifier.constrainAs(btnMagenta){
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            }) {
            Text("Magenta")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButton(){
    ButtonColor()
}
