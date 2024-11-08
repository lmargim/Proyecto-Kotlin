package com.GrupoMALPAP.ProyectoKotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.GrupoMALPAP.ProyectoKotlin.navegacion.Navegacion
import com.GrupoMALPAP.ProyectoKotlin.ui.theme.ProyectoKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoKotlinTheme {
                Navegacion()
            }
        }
    }
}
