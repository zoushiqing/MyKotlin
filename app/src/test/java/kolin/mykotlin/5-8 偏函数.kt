package kolin.mykotlin

import org.junit.Test
import java.nio.charset.Charset

class pianhanshu {
    @Test
    fun test() {
        println("中国人".toByteArray().size)
        
        println(makeString("中国人".toByteArray(), charset("UTF-8")))
    }
}

val makeString = fun(bytearray: ByteArray, charset: Charset) {
    String(bytearray, charset)
}
val makeStringFromGBKBytes = makeString.partial2(charset("GBK"))

fun <P1, P2, R> Function2<P1, P2, R>.partial2(p2: P2) = fun(p1: P1) = this(p1, p2)