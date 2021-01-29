package example.myapp

fun buildAquarium() {
//    val aquarium1 = Aquarium()
//    // default height and length
//    aquarium1.printSize()
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()

//    val aquarium6 = Aquarium(numberOfFish = 29)
//    aquarium6.printSize()
//    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")
//    aquarium6.volume = 70
//    aquarium6.printSize()

    val myAquarium = Aquarium(25, 25, 40)
    myAquarium.printSize()
    val myTower = TowerTank(25, 40)
    myTower.printSize()

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

}

fun main() {
    //buildAquarium()
    makeFish()
}