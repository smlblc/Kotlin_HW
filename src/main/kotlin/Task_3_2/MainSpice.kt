package Task_3_2

fun main() {

    val spice_0 = Spice("Bell Pepper", "No_Spice")
    val spice_1 = Spice("Anaheim", "Mild")
    val spice_2 = Spice("Poblano", "Medium")
    val spice_3 = Spice("Guajillo", "Medium")
    val spice_4 = Spice("Jalapeno", "Hot")
    val spice_5 = Spice("Serrano", "Hot")
    val spice_6 = Spice("Cayenne", "Hot")
    val spice_7 = Spice("Chile de Arbol", "Fire")
    val spice_8 = Spice("Thai Chili", "Fire")
    val spice_9 = Spice("Habanero", "Poison")
    val spice_10 = Spice("Ghost Pepper", "Poison")


    val spiceList: List<Spice> = listOf(
        spice_0,
        spice_1,
        spice_2, spice_3,
        spice_4, spice_5, spice_6,
        spice_7, spice_8,
        spice_9, spice_10
    )

    val spicesNotDangerous: List<Spice> = spiceList.filterNot { spice -> spice.heat >= 5 }

    println("All the spices: ")
    spiceList.forEach { println("{ ${it.name} | ${it.spiceness} | ${it.heat} }") }

    println("Spices are not Dangerous")
    spicesNotDangerous.forEach { println("{ ${it.name} | ${it.spiceness} | ${it.heat} }") }

}

