fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium(length = 25, width = 25, height = 40)
    myAquarium.printSize()
    val myAquarium1 = TowerTank(height = 45, diameter = 25)
    myAquarium1.printSize()
}

fun makeFish() {
    val myFish = Shark()
    myFish.eat()
    println("Shark color: ${myFish.color}")
    val myFish2 = Tilapia()
    myFish2.eat()
    println("Tilapia color: ${myFish2.color}")
}