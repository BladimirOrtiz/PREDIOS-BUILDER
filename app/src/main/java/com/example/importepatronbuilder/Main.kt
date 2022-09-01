package com.example.importepatronbuilder

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.DecimalFormat
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    val person = Person(fullName = "Jesus Pacheco",
        dateOfBirth= LocalDate.parse("2000-12-24"),
        genre="H",isSingleMother = false)

    val urbanZone= Zone(key="URB", zone = "Urbana", cosForSquareMeter = 10.0)
    val ruralZone= Zone(key="RUR", zone = "Rural", cosForSquareMeter = 8.0)

    val tax =Tax.Builder(folio = 1, dateOfPayment = LocalDate.now(),
        owner = person)
        .addProperty(Property(zone=urbanZone, areaInSquareMeter = 12000.0))
        .addProperty(Property(zone=ruralZone, areaInSquareMeter = 500.0))
        .build()

    val decimalFormat = DecimalFormat("#,###.00")

    println("El impuesto a pagar de ${person.fullName} es de:  " +
            "$${decimalFormat.format(tax.getTotal())}")
}
