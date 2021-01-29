package Task_3_4

import Task_3_5_and_Task_3_6.Color

sealed class Spice(val name: String, val spiceness: String = "Mild", val spiceColor: SpiceColor = YellowSpiceColor) :
    SpiceColor by YellowSpiceColor {

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

    abstract fun prepareSpice()
}

class Curry(name: String, spiceness: String) : Spice(name, spiceness), Grinder {

    override fun prepareSpice() {
        println("The Spice $name is prepared now, Spiceness Level is $spiceness")
    }

    override fun grind() {
        super.grind()
        println("This $name with level of $spiceness is a $name powder now")
    }

}

interface Grinder {
    fun grind() {
        println(
            "CAUTION: You are grinding your Spice now: " +
                    "\n !!! There is no way to go back after this process !!!"
        )
    }
}

fun main() {

    val curry = Curry("Curry", "Mild")
    println("Color of ${curry.name} is ${curry.color}")
}

//Delegation (Optional)

interface SpiceColor {
    var color: Color
}

object YellowSpiceColor : SpiceColor {
    override var color: Color = Color.YELLOW

}