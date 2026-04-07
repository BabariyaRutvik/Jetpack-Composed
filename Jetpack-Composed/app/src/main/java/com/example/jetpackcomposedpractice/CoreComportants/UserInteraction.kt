package com.example.jetpackcomposedpractice.CoreComportants

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PartialSelectable(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){

        SelectionContainer {
            Column {
                Text(text = "Hello Rutvik Babariya")
                Text(text = "Hello World")
                Text(text = "Hello Kotlin")
                Text(text = "Hello Jetpack Composed")
                Text(text = "Hello Android")

                DisableSelection {
                    Text(text = "Hello World")
                    Text(text = "Hello Kotlin")
                    Text(text = "Hello Jetpack Composed")
                    Text(text = "Hello Android")

                }
            }
        }
    }
}
@Composable
fun AnnotatingStringWithListener(){
   val uriHandler = LocalUriHandler.current
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(buildAnnotatedString {
            append("Build Solid app With ")
            val linkAnnotation = LinkAnnotation.Url(
                url = "https://developer.android.com/courses/jetpack-compose/course",
                styles = TextLinkStyles(SpanStyle(color = Color.Blue))
            ) {
                val url = (it as LinkAnnotation.Url).url
                uriHandler.openUri(url)
            }
            
            // withLink requires a block { } to define the clickable text
            withLink(linkAnnotation) {
                append("Jetpack Compose Course")
            }
        })
    }

}
@Preview(showSystemUi = true)
@Composable
fun PartialSelectablePreview(){
  //  PartialSelectable()
    AnnotatingStringWithListener()
}