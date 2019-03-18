package kolin.mykotlin

import org.junit.Test

/**
 * 写在类中的函数 就叫做 方法
 * 构造方法参数中 val/var修饰的都是属性  如果没有val或者var 就不是属性了 只是一个构造方法的参数
 * 属性的初始化 尽量放在构造方法中
 * 无法在构造方法中 尝试降级为局部变量
 */
class X
class A {
    var b = 0
    lateinit var c: String//延迟初始化 我在后边会妥善处置的
    lateinit var d: X

    val e: X by lazy {
        //val用lateinit不行  所以用lazy 这样的话用到的时候才会加载
        println("init X")
        X()
    }

    var cc: String? = null//这样不好 每次用起来都要 判空
    @Test
    fun test() {
        println("start")
        val a = A()
        println("init a")
        println(a.b)
        println(a.e)

        a.d = X()
        println(a.d)

//        println(a.c)

        println(a.cc?.length)
    }
}