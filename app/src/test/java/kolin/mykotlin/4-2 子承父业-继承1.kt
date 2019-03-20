package kolin.mykotlin

import org.junit.Test

/**
 * 1.如果不是抽象类 就必须得加 open
 * 2.无论是抽象类 还是open的类 里面的方法如果实现了  子类想要继承 父类都必须得给方法open
 * 3.如果方法不实现 就不需要open
 * 总结：
 * 1.如果一个类 或者 一个方法 一个属性 需要被继承 就必须得open
 * 2.abstract的类 或者 方法 属性 就不需要open了
 */
abstract class Person(open val age: Int) {
    abstract fun work()
}

class MaNong(age: Int) : Person(age) {
    override fun work() {
        println("我是码农，我在写代码")
    }
}

class Doctor(age: Int) : Person(age) {
    override fun work() {
        println("我是医生，我在给病人看病")
    }
}

class extends1 {
    @Test
    fun main() {
        val person = MaNong(1)
        person.work()
        println(person.age)
        val person2 = Doctor(2)
        person2.work()
        println(person2.age)
    }
}

///////////////////////////////////////////////////////////////////////
interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

class Manager : Driver, Writer {
    override fun write() {

    }

    override fun drive() {

    }

}

//接口代理 要实现父类的方法  通过传进来的对象处理了
class SeniorManager(val driver: Driver, val writer: Writer) :
        Driver by driver, Writer by writer {

}

class CarDriver : Driver {
    override fun drive() {
        println("开卡车")
    }
}

class PPTWriter : Writer {
    override fun write() {
        println("做PPT呢")
    }

}

class extend2 {
    @Test
    fun test() {
        val driver = CarDriver()
        val writer = PPTWriter()
        val seniorManager = SeniorManager(driver, writer)
        seniorManager.drive()
        seniorManager.write()
    }
}