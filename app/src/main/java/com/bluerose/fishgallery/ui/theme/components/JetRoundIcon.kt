package com.bluerose.fishgallery.ui.theme.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.R

@Composable
fun JetRoundIcon(
    @DrawableRes drawableId: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.onPrimary.copy(0.5f), CircleShape)
            .border(3.dp, MaterialTheme.colorScheme.onPrimary.copy(0.35f), CircleShape)
            .padding(1.dp)
            .size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(drawableId),
            contentDescription = "",
            tint = Color.White,
            modifier = modifier.size(60.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ShowPreview() {
    FishGalleryTheme {
        JetRoundIcon(
            drawableId = R.drawable.ic_appicon1
        )
    }
}