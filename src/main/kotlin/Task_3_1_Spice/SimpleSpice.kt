package Task_3_1_Spice

class SimpleSpice() {

    val spiceName: String = "Curry"
    var spiceLevel: String = "mild"
    var heat :Int = -1
        get() { return if (spiceLevel == "mild") 5 else -1 }


}
