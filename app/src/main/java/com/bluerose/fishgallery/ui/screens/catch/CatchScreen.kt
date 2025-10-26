package com.bluerose.fishgallery.ui.screens.catch

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.bluerose.fishgallery.ui.screens.catch.models.CatchEvent
import com.bluerose.fishgallery.ui.screens.catch.views.CatchViewDisplay

@Composable
fun CatchScreen(
    navController: NavController
) {
    val dispatcher: (CatchEvent) -> Unit = { event: CatchEvent ->
        when(event) {
            CatchEvent.CloseScreen -> {navController.navigateUp()}
            CatchEvent.EnterScreen -> {} // TODO:
            CatchEvent.ReloadScreen -> {} // TODO:
        }
    }

    CatchViewDisplay(
        dispatcher = dispatcher
    )
}