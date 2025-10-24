package com.bluerose.fishgallery.ui.screens.statistics.models

sealed class StatisticsEvent {

    data object EnterScreen: StatisticsEvent()

    data object ReloadScreen: StatisticsEvent()
}