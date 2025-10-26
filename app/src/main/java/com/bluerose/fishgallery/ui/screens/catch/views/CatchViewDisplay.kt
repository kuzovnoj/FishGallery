package com.bluerose.fishgallery.ui.screens.catch.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.R
import com.bluerose.fishgallery.ui.screens.catch.models.CatchEvent
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.components.JetIconButton

@Composable
fun CatchViewDisplay(
    dispatcher: (CatchEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 24.dp, vertical = 32.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            JetIconButton(
                vectorDrawableId = R.drawable.ic_fluent__chevron_left_16_filled,
                contentPadding = PaddingValues(12.dp),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.size(48.dp),
                onClick = { dispatcher.invoke(CatchEvent.CloseScreen) }
            )

            Text(
                text = stringResource(R.string.our_profit_title),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onBackground
            )

            Box(Modifier.size(48.dp))
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            CatchCard(
                "Призрачный дельфи",
                "50 000 000 тонн",
                "file:///android_asset/App1_Image1.jpg",
                modifier = Modifier.fillMaxWidth()
            )

            CatchCard(
                "Алмазный ус",
                "48 000 000 тонн",
                "file:///android_asset/App1_Image2.jpg",
                modifier = Modifier.fillMaxWidth()
            )

            CatchCard(
                "Шестиперая аку",
                "10 000 000 тонн",
                "file:///android_asset/App1_Image3.jpg",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
private fun ShowPreview() {
    FishGalleryTheme {
        CatchViewDisplay {}
    }
}