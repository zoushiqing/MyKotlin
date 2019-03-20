package kolin.mykotlin

import org.junit.Test

class testt {

    private fun main(vararg args: String) {
//        for (arg in args) {
//            println(arg)
//        }
        println("-------------具名参数---------------")
        val array= intArrayOf(1,3,4,5)
        hello(3.0, *array, string = "hello")//*:spread operator 只能展开数组(array) 且只支持变长参数
    }
    private fun hello(double: Double, vararg ints: Int, string: String) {
        ints.forEach(::println)
        println(double)
        println(string)
    }
    @Test
    fun test() {
        main()
    }
}
