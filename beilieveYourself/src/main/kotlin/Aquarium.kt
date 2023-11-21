import kotlin.math.PI

open class Aquarium(open var height: Int = 100, open var width: Int = 20, open var length: Int = 50) {
    open var volume: Int
        get() = width * height * length
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
        "Length: $length cm " +
        "Height: $height cm ")
        println("Volume: $volume 1 \tWater: $water 1 (${water / volume * 100.0}% full)")
    }
}

open class TowerTank(override var height: Int, diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override val shape = "cylinder"

    override var volume: Int
        get() = (width/2 * length/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water: Double = 0.8 * volume
}