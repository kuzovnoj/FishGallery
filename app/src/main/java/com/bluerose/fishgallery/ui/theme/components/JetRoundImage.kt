package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme

@Composable
fun JetRoundImage(
    imagePath: String,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(32.dp)
) {
    AsyncImage(
        model = imagePath,
        modifier = modifier
            .border(3.dp, MaterialTheme.colorScheme.surface, shape)
            .clip(shape),
        contentDescription = "",
        contentScale = ContentScale.Crop
    )
}

@Preview
@Composable
private fun ShowPreview() {
    FishGalleryTheme {
        JetRoundImage("file:///android_asset/App1_Image1.jpg")
    }
}