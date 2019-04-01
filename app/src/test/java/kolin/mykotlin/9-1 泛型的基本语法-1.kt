package kolin.mykotlin

import org.junit.Test

/**
 * desc:
 */
/**
 * 泛型 鸭子类型
 * 如何为函数声明泛型
 * 如何为类声明泛型
 * 泛型的边界值
 */
fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a < b) b else a
}

data class Complex2(val a: Double, val b: Double) : Comparable<Complex2> {

    override fun compareTo(other: Complex2): Int {
        return (value() - other.value()).toInt()
    }

    private fun value(): Double {
        return a * a + b * b
    }

    override fun toString(): String {
        return "Complex2(a=$a, b=$b)"
    }
}

class fanxin {
    @Test
    fun test() {
        val a = 4
        val b = 3
        val c = maxOf(a, b)
        println(c)
        //////////////////////////////////////////
        println(Complex2(3.0, 4.0))
        //////////////////////////////////////////
        val complex2 = Complex2(3.0, 4.0)
        val complex3 = Complex2(4.0, 5.0)
        println(maxof(complex2, complex3))
    }
}