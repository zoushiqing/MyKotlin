package kolin.mykotlin

import org.junit.Test

/**
 * 1.lambda表达式的返回值 是表达式最后一行的值
 * 2.如果函数的最后一个参数是lambda表达式 可以将lambda表达式移到括号外边
 * 3.如果lambda表达式移出去后 括号里面没有参数 可以将括号省略
 * 4.
 */
class Lambda表达式 {

    val sum = { arg1: Int, arg2: Int ->
        println("$arg1 + $arg2 = ${arg1 + arg2}")
        arg1 + arg2
    }//(Int,Int) -> Int


    val printHello = {
        println("Hello")
    }//()->Unit


    @Test
    fun test() {
//        println(sum(1, 3))
//        //上下 相同的原理
//        println(sum.invoke(1, 3))
        //--------------------------------------
        main(arrayOf("4", "2", "3", "1"))
    }

    fun main(args: Array<String>) {//(Array<String>)->Unit
        // for (i in args) {
//            println(i)
//        }

//        public inline fun <T> Array<out T>.forEach(action: (T) -> Unit): Unit {
//            for (element in this) action(element)
//        }

//        args.forEach{println(it)}

//        args.forEach(::println)

        args.forEach ForEach@{
            if (it == "3") return@ForEach
            println(it)
        }
        println("The End")//4  2  1  The End

        println(sum)//Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>
        
    
    }

    fun sum(arg1: Int, arg2: Int) = arg1 + arg2//(Int,Int)->Int
}

