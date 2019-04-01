package kolin.mykotlin

import org.junit.Test

/**
 * desc:
 */
/**
 * in  逆变 作为传入的参数类型不能作为返回值
 * out 协变 作为返回值得类型不能作为参数传入
 * in  只能传入
 * out 只能返回
 */
data class Complex3<T : Number>(val a: T, val b: T) {
    override fun toString(): String {
        return "Complex3(a=$a, b=$b)"
    }
}

class fanxin2 {
    @Test
    fun test() {
        val complex3 = Complex3(3.0, 4.0)
        val complex31 = Complex3(5, 6)
        println(complex3)
        println(complex31)

    }
}