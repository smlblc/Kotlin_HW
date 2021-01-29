package Task_3_5_and_Task_3_6

import Task_3_2.Spice
import Task_3_4.SpiceColor
import Task_3_4.YellowSpiceColor
import sun.security.provider.ConfigFile

data class SpiceContainer(val spice: Spice){

    val label: String = spice.name

}

fun main() {
    val paprika = Spice("Paprika", "Hot")
    val turmeric = Spice("Turmeric","No_Spice")
    val tamarind = Spice("Tamarind", "Hot")
    val garam_masala = Spice("Garam_Masala", "Hot")
    val thaiChili = Spice("Thai Chili", "Fire")
    val wasabi = Spice("Wasabi", "Poison")

    val paprikaContainer = SpiceContainer(paprika)
    println(paprikaContainer.label)

    val turmericContainer = SpiceContainer(turmeric)
    println(turmericContainer.label)

    val tamarindContainer = SpiceContainer(tamarind)
    println(tamarindContainer.label)

    val garam_masalaContainer = SpiceContainer(garam_masala)
    println(garam_masalaContainer.label)
}