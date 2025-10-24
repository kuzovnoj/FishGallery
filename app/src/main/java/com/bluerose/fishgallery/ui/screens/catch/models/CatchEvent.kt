package com.bluerose.fishgallery.ui.screens.catch.models

sealed class CatchEvent {

    data object EnterScreen: CatchEvent()

    data object ReloadScreen: CatchEvent()
}