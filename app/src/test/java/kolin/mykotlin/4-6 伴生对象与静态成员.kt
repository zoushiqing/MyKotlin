package kolin.mykotlin

import org.junit.Test

/**
 * 说白了 就是java中的静态方法
 *     val a = minOf(args[0].toInt(), args[1].toInt())
 *     minOf 这个函数是kotlin中不存在任何类中的 高级静态方法
 */

class statetest {
    fun main(args: Array<String>) {
        val a = minOf(args[0].toInt(), args[1].toInt())
    }
    @Test
    fun test(){
        val latitude = Latitude.ofDouble(3.0)
        Latitude.ofLatitude(latitude)
        println(Latitude.TAG)
    }
}

/**
 * 1.构造器私有化 没法给构造函数传参数了
 * 2.通过伴生对象 companion object 提供的方法就是静态方法
 * 3.直接   Latitude.ofDouble(3.0) 来操作这个函数
 * 4.里面的属性直接 Latitude.TAG 调用
 */
class Latitude private constructor(val value: Double) {
    companion object {
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }
        //所谓的对象拷贝
        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }
        val TAG:String="TAG"
    }
}