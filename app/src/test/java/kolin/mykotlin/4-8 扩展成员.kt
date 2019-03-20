package kolin.mykotlin

import org.junit.Test

class exttends {
    @Test
    fun test() {
        println("A".multiply(3))

        println("zoushqing".a)
    }

}

//扩展方法  里面的this 就是它的调用者
fun String.multiply(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}
//扩展属性
val String.a: String
    get() = "abc"
var String.b: Int
    set(value) {
        
    }
    get() = 5