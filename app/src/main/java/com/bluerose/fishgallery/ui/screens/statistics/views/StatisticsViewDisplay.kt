package com.bluerose.fishgallery.ui.screens.statistics.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.R
import com.bluerose.fishgallery.ui.screens.statistics.models.StatisticsEvent
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.components.JetRoundIcon
import com.bluerose.fishgallery.ui.theme.jetShape

@Composable
fun StatisticsViewDisplay(
    dispatcher: (StatisticsEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 24.dp, vertical = 32.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Text(
            text = stringResource(R.string.header_title),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onSecondary
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            StatisticsCard(
                stringResource(R.string.our_catch_title),
                "~ 108 000 000 ",
                stringResource(R.string.our_catch_value),
                modifier = Modifier.fillMaxWidth(),
                onClick = { dispatcher.invoke(StatisticsEvent.OpenCatchScreen) }
            )

            StatisticsCard(
                stringResource(R.string.our_profit_title),
                "> 5 400 000 ",
                stringResource(R.string.our_profit_value),
                modifier = Modifier.fillMaxWidth(),
                onClick = { dispatcher.invoke(StatisticsEvent.OpenCatchScreen) }
            )

            StatisticsCard(
                stringResource(R.string.our_partners_title),
                "1 500+ ",
                stringResource(R.string.our_partners_value),
                modifier = Modifier.fillMaxWidth(),
                onClick = { dispatcher.invoke(StatisticsEvent.OpenCatchScreen) }
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier.align(Alignment.End),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                stringResource(R.string.footer_title),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onSecondary
            )

            JetRoundIcon(
                drawableId = R.drawable.ic_appicon1,
                modifier = Modifier
                    .clickable(onClick = { })
                    .clip(shape = jetShape.medium)
            )
        }
    }
}

@Preview
@Composable
private fun ShowPreview() {
    FishGalleryTheme {
        StatisticsViewDisplay {}
    }
}