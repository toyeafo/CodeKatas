interface FishColor {
    val color: String
}

interface FishAction {
    fun eat()
}

class Shark: FishColor, FishAction {
    override val color: String = "grey"
    override fun eat() {
        println("eat fishes")
    }
}

class Tilapia(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("eat stuffs"), FishColor by fishColor

class PrintingFishAction(val food:String): FishAction {
    override fun eat() {
        println(food)
    }
}
object GoldColor: FishColor {
    override val color: String = "gold"
}

sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}