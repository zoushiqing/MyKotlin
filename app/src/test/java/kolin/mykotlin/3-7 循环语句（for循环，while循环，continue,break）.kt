package kolin.mykotlin

import org.junit.Test


class test111 {
    fun main(args: Array<String>) {
        for (arg in args) {
            println(arg)
        }
        for ((index, value) in args.withIndex()) {
            println("$index -> $value")
        }
        for (indexValue in args.withIndex()) {
            println("${indexValue.index} -> ${indexValue.value}")
        }
        println("--------------while循环----------------------------")
        var x = 5
        while (x > 0) {
            println(x)
            x--
        }
        println("--------------跳（过）出循环----------------------------")
        for (i in 1..100) {
            if (i == 2) continue//跳过循环
            if (i == 3) break//跳出循环
            println(i)
        }
    }

    @Test
    fun test1() {
        main(arrayOf("A", "B", "C", "D"))
        println("--------------自定义iterator----------------------------")
        val list = MyIntList()
        list.add(1)
        list.add(2)
        list.add(3)
        for (i in list) {
            println(i)
        }
    }
}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()
    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator())
    }
}