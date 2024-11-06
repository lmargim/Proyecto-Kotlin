package com.GrupoMALPAP.ProyectoKotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.GrupoMALPAP.ProyectoKotlin.navegacion.Navegacion
import com.manuelsantos.ejemplosnavigation.ui.theme.EjemplosNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemplosNavigationTheme {
                Navegacion()
            }
        }
    }
}
