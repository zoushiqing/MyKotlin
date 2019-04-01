package kolin.mykotlin

import org.junit.Test

/**
 *看泛型参数
 * 逆变
 */
class xinbian {
    @Test
    fun test() {
        //协变 Number是Int的父类
        val numberList: List<Number> = listOf(1, 2, 3)
        //逆变 Any是Int的父类
        val iniComparable: Comparable<Int> = object:Comparable<Any>{
            override fun compareTo(other: Any): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
        //不变  MutableList可读写的类型
        val numberArrayList:MutableList<Number> = mutableListOf(1,3,4,5)
    }
}