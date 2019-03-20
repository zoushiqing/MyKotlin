package kolin.mykotlin

import org.junit.Test
import java.util.*

/**
 * 函数签名：
 * 1.函数名 + 参数类型 + 参数个数
 * 2.返回值 不是方法签名的一部分
 * 
 * 方法重载
 * 1.在kotlin 中 方法重载  其实都可以用默认参数来表示
 * 2.java中想调用kotlin中的重载函数 需要加个@JvmOverloads
 */
class Overloads {
    @JvmOverloads
    fun a(int: Int = 0): Int {
        return int
    }
}

class overLoads1{
    @Test
    fun test(){
        val integerList= ArrayList<Int>()
        integerList.add(13)
        integerList.add(2)
        integerList.add(3)
        integerList.add(23)
        integerList.add(5)
        integerList.add(15)
        integerList.add(50)
        integerList.add(500)
        println(integerList)
        //java 中解决不了这种情况
        integerList.removeAt(1)
        integerList.remove(5)
        println(integerList)
    }
}
