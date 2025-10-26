package com.bluerose.fishgallery.ui.screens.statistics.models

sealed class StatisticsAction {
    data object CloseScreen : StatisticsAction()
    data class ShowDialog(
        val title: String,
        val message: String,
        val buttonText: String
    ) : StatisticsAction()
}