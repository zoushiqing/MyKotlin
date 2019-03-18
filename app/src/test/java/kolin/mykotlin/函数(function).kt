package kolin.mykotlin

import org.junit.Test

/**
 * 如果没有返回值即返回unit 就直接用等号表示
 */
class `函数(function)` {

    fun main(args: Array<String>) {
//        println("hello${args[0]}")
        checkArgs(args)
        val arg1 = args[0].toInt()
        val arg2 = args[1].toInt()
        println("$arg1 + $arg2 = ${sum(arg1, arg2)}")
        
        println(int2Long(3).javaClass.simpleName)
    }

    private fun checkArgs(args: Array<String>) {
        if (args.size != 2) {
            printUsage()
            System.exit(0)
        }
    }

    private fun printUsage() {
        println("请传入两个整型参数，例如 1 2 ")
    }

    fun sum(arg1: Int, arg2: Int) = arg1 + arg2
    
    val int2Long = fun(x: Int): Long {
        return x.toLong()
    }

    @Test
    fun test() {
//        main(arrayOf("logon"))
        main(arrayOf("1","2"))

    }
}
