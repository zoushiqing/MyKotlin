package kolin.mykotlin

class House
class Flower
class Countyard {
    private val house: House = House()
    private val flower: Flower = Flower()
}

/**
 * 1.默认是public
 * 2.internal 同一个model 模块中可见
 */
class ForbiddenCity {
    val houses = arrayOf(House(), House())
    internal val flowers = arrayOf(Flower(), Flower())
}

fun main(args: Array<String>) {
    val countyard = Countyard()
    val fc = ForbiddenCity()
    println(fc.houses)
}