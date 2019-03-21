package kolin.mykotlin

import org.junit.Test

enum class LogLevel(val id: Int) {
    VERBOSE(0), DEBUG(1), INFO(2), WARN(4), ERROR(3), ASSERT(5);//注意分号

    fun getTag(): String {
        return "$id,$name"
    }

    override fun toString(): String {
        return "$name,$ordinal"
    }

}

//这个和上面的写法没啥区别
class LogLevel2 protected constructor() {
    companion object {
        val VERBOSE = LogLevel2()
        val DEBUG = LogLevel2()
        val INFO = LogLevel2()
        val WARN = LogLevel2()
        val ERROR = LogLevel2()
        val ASSERT = LogLevel2()
    }
}

class testLogLeve {
    @Test
    fun test() {
        println(LogLevel.VERBOSE.getTag())//0,VERBOSE
        println(LogLevel.WARN.ordinal)//3  所以就是相应的位置
        LogLevel.values().forEach(::println)
        //VERBOSE,0
        //DEBUG,1
        //INFO,2
        //WARN,3
        //ERROR,4
        //ASSERT,5
    }
}