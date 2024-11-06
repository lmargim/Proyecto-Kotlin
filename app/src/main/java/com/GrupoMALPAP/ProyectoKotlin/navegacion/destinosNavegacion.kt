package com.GrupoMALPAP.ProyectoKotlin.navegacion

import kotlinx.serialization.Serializable

@Serializable
object Destinos {
    const val Login = "login"
    const val SeleccionDeHabitaciones = "seleccionDeHabitaciones/{nombre}"
}
