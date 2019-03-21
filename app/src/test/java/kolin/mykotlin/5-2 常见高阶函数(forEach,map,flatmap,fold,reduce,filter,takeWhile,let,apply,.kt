package kolin.mykotlin

import org.junit.Test

class Testgao {
    @Test
    fun test() {
        main(arrayOf())
    }

    fun main(args: Array<String>) {
        val list = listOf(1, 3, 3, 4, 5, 6, 6)
        //第一种
        val newList = list.map {
            it * 2 + 3
        }
        newList.forEach(::println)//5 9 9 11 13 15 15
        //第二种
        val newList2 = list.map(Int::toDouble)
        newList2.forEach(::println)//1.0 3.0 3.0 4.0 5.0 6.0 6.0
    }
}

/////////////////////////////////////////////////////////////
class Testgao1 {
    @Test
    fun test() {
        val list = listOf(
                1..20,
                2..5,
                100..322
        )
        //把集合打平
        val flatList = list.flatMap {
            it.map {
                "No.$it"
            }
        }
        flatList.forEach(::println)
    }
}

/////////////////////////////////////////////////////////////
class Testgao2 {
    @Test
    fun test() {
        val list = listOf(
                1..20,
                2..5,
                100..322
        )
        val flatList = list.flatMap {
            it
        }
        flatList.forEach(::println)
        //对调用者的一个累计 操作 acc原来的值  i 新的值
        println(flatList.reduce { acc, i -> acc + i })

        /////////////////////对0-6的元素分别求阶乘////////////////////////////////
        (0..6).map(::factorial).forEach(::println)
        ////////////////////拿到结果之后再求和///////////////////////////////////
        (0..6).map(::factorial).reduce { acc, i -> acc + i }
        //////////////////////给个初始值 5 /////////////////////////////////////////////
        (0..6).map(::factorial).fold(5) { acc, i -> acc + i }
        //////////////////////字符串链接/////////////////////////////////////////
        (0..6).joinToString(",")
        //////////////////////获得里面的奇数///////////////////////////////////
        (0..6).map(::factorial).filter { it % 2 == 1 }
        //////////////////////获得里面的奇数位的数///////////////////////////////////
        (0..6).map(::factorial).filterIndexed { index, i -> index % 2 == 1 }
        /////////////////////遇到第一个偶数就停止/遇到不符合的就停止//////////////////////////////////
        (0..6).map(::factorial).takeWhile { it % 2 == 1 }

    }

}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }

}

