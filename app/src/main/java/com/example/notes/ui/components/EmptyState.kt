package com.example.notes.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.notes.R

@Composable
fun EmptyState() {
    ShowImage()
    ImageText()
}

@Composable
fun ShowImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_note),
        contentDescription = "Empty",
        modifier = Modifier.height(260.dp),
        contentScale = ContentScale.Fit
    )
}

@Composable
fun ImageText() {
    Text(
        text = "Create Your First Note!",
        color = Color.White,
        fontWeight = FontWeight.SemiBold
    )
}