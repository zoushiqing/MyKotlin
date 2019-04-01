package kolin.mykotlin

import org.junit.Test

/**
 * SAM转化
 * 1.Single Abstract Method
 * 2.SAM 转换的条件：java的接口，单一接口方法
 * 3.注意转换后的实例变化
 */
class samtest {
    @Test
    fun test() {
        val samInJava = SAMInJava()
        val lambda = {
            println("Hello")
        }
        samInJava.add(lambda)
        samInJava.add(lambda)
        samInJava.add(lambda)
        samInJava.add(lambda)

        samInJava.remove(lambda)
        samInJava.remove(lambda)
        samInJava.remove(lambda)
        samInJava.remove(lambda)

        val samInKotlin = SAMInKotlin()
        //kotlin中没有支持直接传一个lambda表达式  但是添加一个类型别名就行了
        samInKotlin.addTask {
            println("Hello")
        }
    }
}