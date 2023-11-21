package decor

data class Decoration(val rocks: String) {
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(90), EAST(180), WEST(270)
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
    println(Direction.EAST.name)
    println(Direction.WEST.ordinal)
    println(Direction.SOUTH.degrees)

}

fun main() {
    makeDecorations()
}