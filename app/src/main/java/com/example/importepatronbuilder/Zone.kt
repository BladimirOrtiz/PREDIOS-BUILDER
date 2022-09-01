package com.example.importepatronbuilder

data class Zone (  val zone:String,
                      val key : String,
                   val cosForSquareMeter:Double)
{
    override fun toString() : String {

        return zone
    }

}
