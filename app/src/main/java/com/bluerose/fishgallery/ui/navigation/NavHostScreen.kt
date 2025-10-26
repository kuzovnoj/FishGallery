package com.bluerose.fishgallery.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bluerose.fishgallery.ui.screens.catch.CatchScreen
import com.bluerose.fishgallery.ui.screens.statistics.StatisticsScreen

@Composable
fun NavHostScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavScreen.Statistics,
        modifier = modifier.fillMaxSize()
    ) {
        composable<NavScreen.Statistics> { StatisticsScreen(navController) }
        composable<NavScreen.Catch> { CatchScreen(navController) }
    }
}