package com.GrupoMALPAP.ProyectoKotlin.ui.theme.screen.seleccionDeHabitacionScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.GrupoMALPAP.ProyectoKotlin.R

@Composable
fun SeleccionDeHabitacionScreen(nombre: String, navigateToBack: () -> Unit, navigateToLogin: () -> Unit) {
    // TODO Columna provisional, implementar distribucion de la pantalla
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Texto que coge el mensaje de bienvenida de res/values/strings.xml
        Text(stringResource(id = R.string.Bienvenida) + " " + nombre, style = MaterialTheme.typography.displayMedium)
        // Boton para navegar atras
        // TODO Tenemos que hacer que el boton este en la parte superior izq con el floating button en otra pantalla
        Button(onClick = { navigateToBack() }) {
            Text("Ir atras")
        }
        // Boton para ir a la pantalla de login
        // TODO Hay que implementar el boton en alguna parte de la pantalla, decidir en reunion
        Button(onClick = {navigateToLogin()}) {
            Text("Logout")
        }
    }
}