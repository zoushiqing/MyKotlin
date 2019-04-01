package kolin.mykotlin

import org.junit.Test

/**
 * desc:
 */
@PoKo
data class Person3(var name: String, var age: Int)

fun Person3.sayHello() {
    println("Hello")
}

class fanshe2 {
    @Test
    fun test() {
        val clazz=Person3::class.java
        Class.forName("kolin.mykotlin.javaReflectionsKt").getDeclaredMethod("sayHello", Person3::class.java).invoke(null)
        
    }
}