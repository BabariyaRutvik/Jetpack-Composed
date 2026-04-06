package com.example.jetpackcomposedpractice.FundamentalConcept


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposedpractice.R


// String Access
@Composable
fun AccessStringRes(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = stringResource(R.string.name))
    }
}


// Color Access
@Composable
fun AccessColorResource(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = stringResource(R.string.name), color = colorResource(id = R.color.red))
    }
}
// image Access
@Composable
fun ImageAccess(){
    // Align image to top
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ){
        Image(painter = painterResource(id = R.drawable.bmw_wal), contentDescription = "BMW"
        , modifier = Modifier.fillMaxSize()
        ,contentScale = ContentScale.FillBounds)
    }
}


@Preview(showBackground = true)
@Composable
fun AccessStringResPreview() {
    //AccessStringRes()
    //AccessColorResource()
    ImageAccess()
}