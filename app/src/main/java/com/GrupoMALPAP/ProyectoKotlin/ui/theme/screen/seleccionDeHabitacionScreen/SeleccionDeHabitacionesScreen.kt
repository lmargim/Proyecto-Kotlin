package com.GrupoMALPAP.ProyectoKotlin.ui.theme.screen.seleccionDeHabitacionScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SeleccionDeHabitacionScreen(nombre: String, navigateToBack: () -> Unit, navigateToLogin: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text("Hola $nombre", style = MaterialTheme.typography.displayMedium)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToBack() }) {
            Text("Ir atras")
        }
        Button(onClick = {}) {
            Text("Ir ajustes")
        }
        Button(onClick = {navigateToLogin()}) {
            Text("Logout")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}