package kolin.mykotlin

import org.junit.Test

//编译时期常量
const val HELLO_WORLD = "Hello World"

class Demo {
    var helloWorld = "HelloWorld"
    //这叫类型推导
    var helloWorld1: String = "HelloWorld"

    @Test
    fun test() {
        println(HELLO_WORLD)
    }
}
