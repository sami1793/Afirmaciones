package com.ada.afirmaciones.data

import com.ada.afirmaciones.R
import com.ada.afirmaciones.model.Afirmacion

class Datasource {
    fun cargarAfirmaciones(): List<Afirmacion>{
        return listOf<Afirmacion>(
            Afirmacion(R.string.afirmacion1),
            Afirmacion(R.string.afirmacion2),
            Afirmacion(R.string.afirmacion3),
            Afirmacion(R.string.afirmacion4),
            Afirmacion(R.string.afirmacion5),
            Afirmacion(R.string.afirmacion6),
            Afirmacion(R.string.afirmacion7),
            Afirmacion(R.string.afirmacion8),
            Afirmacion(R.string.afirmacion9),
            Afirmacion(R.string.afirmacion10)
        )
    }
}