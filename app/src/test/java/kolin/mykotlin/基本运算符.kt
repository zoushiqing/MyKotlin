package kolin.mykotlin

import org.junit.Test

/**
 * operator 标识符
 * 1.任何类可以定义或者重载父类的基本运算符
 * 2.通过运算符对应的具名函数来定义
 * 3.对参数个数作要求，对参数和返回值类型不作要求
 * 4.不能向scala一样定义任意运算符
 */
class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary + other)
    }

    operator fun plus(other: Any): Int {
        return real.toInt()
    }

    //取模
    operator fun invoke(): Double {
        return Math.hypot(real, imaginary)
    }

    override fun toString(): String {
        return "$real + $imaginary"
    }

}

//中缀表达式
class Book {
    infix fun on(any: Any): Boolean {
        return false
    }
}

class Desk

class Test {
    @Test
    fun test() {
        val c1 = Complex(3.0, 4.0)
        val c2 = Complex(2.0, 7.5)
        println(c1 + c2)//5.0 + 11.5
        println(c1 + 5)//8.0 + 9.0
        println(c1 + "Hello")
        println(c1())//5.0

        main(arrayOf("-name", "Xman"))
    }

    fun main(args: Array<String>) {
        // -name <Name>
        if ("-name" in args) {
            println(args[args.indexOf("-name") + 1])
        }

        if (Book() on Desk()) {//dsl 用的比较多

        }
    }
}

