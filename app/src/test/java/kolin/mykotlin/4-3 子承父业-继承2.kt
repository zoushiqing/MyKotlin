package kolin.mykotlin

import org.junit.Test

abstract class A2 {
    open fun x(): Int = 5
}

interface B {
    fun x(): Int = 1
}

interface C {
    fun x(): Int = 0
}

/**
 * 解决继承冲突
 * 
 * 父类有相同的函数名字 继承之后 通过super<T>.x() 的方式调用不同父类的函数
 * 要求
 * 1.函数名得是一样的
 * 2.返回值得是一样的
 * 
 * 当然是用泛型参数也是可以实现的
 */
class D(val y: Int = 0) : A2(), B, C {
    override fun x(): Int {
        if (y > 0) {
            return y
        } else if (y < -200) {
            return super<C>.x()
        } else if (y < -100) {
            return super<B>.x()
        } else {
            return super<A2>.x()
        }
    }
}

class extends3 {
    @Test
    fun test() {
        println(D(3).x())
        println(D(-10).x())
        println(D(-110).x())
        println(D(-100000).x())
    }
}