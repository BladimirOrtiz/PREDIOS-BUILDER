package com.example.importepatronbuilder

data class Property (val zone:Zone,
                     val areaInSquareMeter:Double)
{
    fun tax() : Double {
        return zone.cosForSquareMeter * areaInSquareMeter
    }
}
