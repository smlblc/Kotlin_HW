package Task_3_2

class Spice(val name: String, val spiceness: String = "Mild") {

    val heat: Int
        get() = when (spiceness) {
            "No_Spice" -> 0
            "Mild" -> 1
            "Medium" -> 2
            "Hot" -> 3
            "Fire" -> 4
            "Poison" -> 5
            else -> -1
        }

    init {
        println("Name: $name | Spiciness: $spiceness | Heat: $heat")
    }

    fun makeSalt() = Spice("Salt", "No_Spice")

}


