package kolin.mykotlin

import org.junit.Test


class test {
    fun sum(int1: Int, int2: Int) = int1 + int2

    fun main(args: Array<String>) {
        try {
            val arg1 = args[0].toInt()
            val arg2 = args[1].toInt()
            println("$arg1 + $arg2 = ${sum(arg1, arg2)}")
        } catch (e: NumberFormatException) {
            println("您确定输入的是整数吗？")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("您确定输入的是两个整数吗？")
        } catch (e: Exception) {
            println("程序出现了未知异常，可能是您的人品太差了。${e.message}")
        } finally {
            println("谢谢您使用我们的加法计算器")
        }
    }

    @Test
    fun test() {
        main(arrayOf())
    }
}

fun main(args: Array<String>) {
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
    println(result)
}

class test1 {
    fun main(args: Array<String>) {
        val result = try {
            args[0].toInt() / args[1].toInt()
        } catch (e: Exception) {
            e.printStackTrace()
            0
        }
        println(result)
    }

    @Test
    fun test() {
        main(arrayOf("1","0"))
    }
}