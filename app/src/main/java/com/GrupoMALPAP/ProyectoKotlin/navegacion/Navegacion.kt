package com.GrupoMALPAP.ProyectoKotlin.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.GrupoMALPAP.ProyectoKotlin.ui.theme.screen.seleccionDeHabitacionScreen.SeleccionDeHabitacionScreen
import com.GrupoMALPAP.ProyectoKotlin.ui.theme.screen.loginScreen.LoginScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen { nombre ->
                // Navegamos a "seleccionDeHabitaciones" con el argumento 'nombre'
                navController.navigate("seleccionDeHabitaciones/$nombre")
            }
        }
        composable(
            route = "seleccionDeHabitaciones/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            SeleccionDeHabitacionScreen(
                nombre = nombre,
                onBack = { navController.popBackStack() },
                onLogout = {
                    navController.navigate("login") {
                        popUpTo("login") {
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}
