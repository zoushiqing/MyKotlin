package kolin.mykotlin

import org.junit.Test

/**
 * 
 */
class jihekaugnjia {
    @Test
    fun test() {
        val arrayList = ArrayList<String>()
        arrayList.add("Hello")
        arrayList.add("World")
        arrayList.remove("World")
        arrayList.removeAt(0)
        arrayList.forEach(::println)

        /////////////////////////////////
        //这是一个不可变的list  没有  add remove 等方法
        val list = listOf("Hello", "World")

        ///////////////////////////////////
        //这个也是没有 put  remove 等方法
        val map = mapOf("Key" to "value", "2" to "whatever")

    }
}

object Test2 {
    val list = listOf(1, 2, 4)
}