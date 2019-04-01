package kolin.mykotlin

import org.junit.Test
import kotlin.reflect.full.memberExtensionProperties
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

/**
 * desc:
 */
@PoKo
data class Person4(var name: String, var age: Int)

class kotlinfanshe {

    @Test
    fun test() {
        val kClazz1 = Person4::class//KClass        
        val person = Person4("jason", 18)
        val kClazz2 = person::class//kClass
        val kClazz3 = person.javaClass.kotlin//kClass

        val primaryConstructor = kClazz1.primaryConstructor!!
        val kPeson = primaryConstructor.call("Jason", 18)
        println(kPeson)//Person4(name=Jason, age=18)
        kClazz2.memberProperties.forEach(::println)     //var kolin.mykotlin.Person4.age: kotlin.Int
        //var kolin.mykotlin.Person4.name: kotlin.String

        //泛型
        println(maxof(3, 4))
        kClazz1.memberExtensionProperties.forEach {
            println(it)
        }
        kClazz1.annotations.forEach(::println)
    }
}

data class Complex1(val a: Double, val b: Double) : Comparable<Complex1> {

    override fun compareTo(other: Complex1): Int {
        return (a * a + b * b - other.a * other.a - other.b * other.b).toInt()
    }

}

fun <T : Comparable<T>> maxof(a: T, b: T): T {
    return if (a > b) a else b
}

data class ComplexNumber<T : Number>(val a: T, val b: T)


