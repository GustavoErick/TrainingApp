package com.example.trainingapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trainingapp.ui.screens.ExerciseScreen
import com.example.trainingapp.ui.screens.HomeScreen
import com.example.trainingapp.models.exerciseList

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onExerciseSelected = { exercise ->
                navController.navigate("exercise/${exercise.name}")
            })
        }
        composable("exercise/{exercise}") { backStackEntry ->
            val exerciseName = backStackEntry.arguments?.getString("exercise")
            val selectedExercise = exerciseList.first { it.name == exerciseName }
            ExerciseScreen(selectedExercise)
        }
    }
}
