package kolin.mykotlin

<<<<<<< HEAD
 
=======
import org.junit.Test

val string = "HelloWorld"
fun makeFunction(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}

fun fibonacci(): Iterable<Long> {
    var first = 0L
    var second = 1L
    return Iterable {
        object : LongIterator() {
            override fun hasNext() = true
            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result
            }
        }
    }
}

fun add(x: Int) = fun(y: Int) = x + y

fun add1(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}

class bibao {
    @Test
    fun test() {
        val makeFunction = makeFunction()
        makeFunction()
        makeFunction()
        makeFunction()
        makeFunction()
        //////////////////////////////////////
        for (i in fibonacci()) {
            if (i > 100) break
            println(i)
        }
        //////////////////////////////////////
        println(add(5)(7))
        //////////////////////////////////////
        val add1 = add1(5)
        println(add1(7))
    }
}

>>>>>>> 045b36c72f3d3068ae69868008b49c00e5ef4a08
