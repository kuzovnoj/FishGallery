package com.bluerose.fishgallery.ui.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.utils.dashedBorder


@Composable
fun StatisticsCard(
    label: String,
    textValue: String,
    textSuffix: String,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(
        topStart = 16.dp,
        topEnd = 32.dp,
        bottomEnd = 16.dp
    ),
    onClick: () -> Unit
) {
    Column(
        modifier
            .dashedBorder(
                3.dp,
                color = MaterialTheme.colorScheme.onSurface,
                shape = shape,
                on = 11.dp,
                off = 10.dp
            )
            .background(MaterialTheme.colorScheme.surface, shape = shape)
            .padding(horizontal = 24.dp, vertical = 24.dp)
            .clickable(onClick = onClick)
            .clip(shape),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = label,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = MaterialTheme.typography.bodyLarge.toSpanStyle()
                        .copy(color = MaterialTheme.colorScheme.onSecondary)
                ) {
                    append(textValue)
                }
                withStyle(
                    style = MaterialTheme.typography.bodyMedium.toSpanStyle()
                        .copy(color = MaterialTheme.colorScheme.onSurface)
                ) {
                    append(textSuffix)
                }
            }
        )
    }
}

@Preview
@Composable
fun StatisticsCardPreview() {
    FishGalleryTheme {
        StatisticsCard(
            label = "Наш улов",
            textValue = "~ 108 000 000",
            textSuffix = " тонн",
            modifier = Modifier.fillMaxWidth(),
            onClick = { print("Hi") }
        )
    }
}