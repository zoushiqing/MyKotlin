package kolin.mykotlin

import org.junit.Test
import java.io.BufferedReader
import java.io.FileReader

data class Person1(val name: String, val age: String) {
    fun work() {
        println("$name is working")
    }
}

class let1 {
    fun findPerson(): Person1? {
        return null
    }

    @Test
    fun test() {
        //public inline fun <T, R> T.let(block: (T) -> R): R {}
        findPerson()?.let {
            it.work()
            println(it.name)
            println(it.age)
        }
        //public inline fun <T> T.apply(block: T.() -> Unit): T {}
        findPerson()?.apply {
            work()
            println(name)
            println(age)
        }
        //with 把调用者作为参数穿进去 apply调用者被调用
        //public inline fun <T, R> with(receiver: T, block: T.() -> R): R {}
        with(findPerson()!!) {
            work()
            println(name)
            println(age)
        }
        //不需要 close
        //public inline fun <T : Closeable?, R> T.use(block: (T) -> R): R {
        BufferedReader(FileReader("hello.txt")).use {
            var line: String?
            while (true) {
                line = it.readLine() ?: break
                println(line)
            }
        }
    }
}
