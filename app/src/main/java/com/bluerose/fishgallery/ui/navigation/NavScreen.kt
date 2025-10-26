package com.bluerose.fishgallery.ui.navigation

sealed class NavScreen {

    data object Statistics: NavScreen()

    data object Catch: NavScreen()
}