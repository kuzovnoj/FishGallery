package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.utils.dashedBorder
import com.bluerose.fishgallery.R

@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    contentPadding: PaddingValues,
    shape: RoundedCornerShape,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .dashedBorder(
                2.dp,
                color = MaterialTheme.colorScheme.onPrimary,
                shape = shape,
                on = 7.dp,
                off = 7.dp
            )
            .clip(shape)
            .clickable(onClick = onClick)
            .padding(contentPadding)
    ) {
        Icon(
            painter = painterResource(id = vectorDrawableId),
            contentDescription = "Icon button",
            tint = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3)//primary color
@Composable
fun JetIconButtonPreview() {
    FishGalleryTheme {
        JetIconButton(
            vectorDrawableId = R.drawable.ic_fluent__chevron_left_16_filled,
            contentPadding = PaddingValues(12.dp),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.size(48.dp)
        )
    }
}
