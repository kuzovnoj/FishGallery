package com.bluerose.fishgallery.ui.screens.catch.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.components.JetRoundImage


@Composable
fun CatchCard(
    title: String,
    value: String,
    imagePath: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        JetRoundImage(
            imagePath = imagePath,
            modifier = Modifier.fillMaxWidth()
                .height(160.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.bodySmall,
            )
            Text(
                text = value,
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Normal),
            )
        }

    }

}

@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3)
@Composable
fun JetIconButtonPreview() {
    FishGalleryTheme {
        CatchCard(
            title = "Призрачный дельфи",
            value = "50 000 000 тонн",
            imagePath = "file:///android_asset/App1_Image1.jpg",
        )
    }
}