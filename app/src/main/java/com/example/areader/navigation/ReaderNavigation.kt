package com.example.areader.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.areader.screens.ReaderSplashScreen
import com.example.areader.screens.details.BookDetailsScreen
import com.example.areader.screens.home.HomeScreen
import com.example.areader.screens.login.LoginScreen
import com.example.areader.screens.search.BookSearchScreen
import com.example.areader.screens.stats.StatsScreen
import com.example.areader.screens.update.BookUpdateScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ReaderScreens.SplashScreen.name) {
        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.DetailsScreen.name) {
            BookDetailsScreen(navController = navController)
        }
        composable(ReaderScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }
        composable(ReaderScreens.SearchScreen.name) {
            BookSearchScreen(navController = navController)
        }
        composable(ReaderScreens.StatsScreen.name) {
            StatsScreen(navController = navController)
        }
        composable(ReaderScreens.UpdateScreen.name) {
            BookUpdateScreen(navController = navController)
        }
    }
}