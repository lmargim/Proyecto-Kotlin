package com.GrupoMALPAP.ProyectoKotlin.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.GrupoMALPAP.ProyectoKotlin.ui.theme.screen.seleccionDeHabitacionScreen.SeleccionDeHabitacionScreen
import com.GrupoMALPAP.ProyectoKotlin.ui.theme.screen.loginScreen.LoginScreen

// FICHERO EN EL QUE SE CONTROLA LA NAVEGACION ENTRE PANTALLAS
// TODO agregar todas las pantallas que faltan

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        // Pantalla de login
        composable("login") {
            LoginScreen { nombre ->
                // Navegar a "seleccionDeHabitaciones" usando el nombre como parámetro
                navController.navigate("seleccionDeHabitaciones/$nombre")
            }
        }
        // Pantalla de selección de habitaciones
        composable(
            route = "seleccionDeHabitaciones/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            // Obtener el parámetro "nombre" de los argumentos
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            SeleccionDeHabitacionScreen(
                nombre = nombre,
                navigateToBack = { navController.popBackStack() },
                navigateToLogin = {
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
