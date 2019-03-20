package kolin.mykotlin

import org.junit.Test
import kotlin.reflect.KProperty

class Delegates {
    val hello by lazy {
        "Hello World"
    }
    val hello2 by X1()
    var hello3 by X1()
}

class X1 {
    var value: String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue:$thisRef->${property.name}")
        return value ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("getValue:$thisRef->${property.name}=$value")
        this.value = value
    }

}

class delegates1 {
    @Test
    fun test() {
        val delegates=Delegates()
        println(delegates.hello)
        println("---------"+delegates.hello2)
        println(delegates.hello3)
        delegates.hello3="value of hello3"
        println(delegates.hello3)
    }
}