package com.example.notes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notes.ui.screens.create.CreateNoteScreen
import com.example.notes.ui.screens.home.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
    navController = navController,
    startDestination = "home"
    ) {

        composable("home") {
            HomeScreen(
                onAddClick = {
                    navController.navigate("create")
                }
            )
        }

        composable("create") {
            CreateNoteScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}