package com.bluerose.fishgallery.ui.screens.catch.models

sealed class CatchViewState {
    object Loading : CatchViewState()
    data class Error(val description: String, val icon: Int) : CatchViewState()
    data class Display(val fishCatchGallery: List<String>) : CatchViewState()
}