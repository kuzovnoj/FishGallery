package com.bluerose.fishgallery.ui.screens.catch.models

sealed class CatchAction {
    data object CloseScreen : CatchAction()
    data class ShowDialog(
        val title: String,
        val message: String,
        val buttonText: String
    ) : CatchAction()
}