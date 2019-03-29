package kolin.mykotlin

import org.junit.Test
import java.io.OutputStream

/**
 * 所谓柯里化  就是讲一个函数 变成一系列函数
 * 也就是  多多元函数 变成 一元函数的变换
 */
fun log(tag: String, targe: OutputStream, message: Any?) {
    targe.write("[$tag]:$message\n".toByteArray())
}

fun log1(tag: String) = fun(target: OutputStream) = fun(message: Any?) = target.write("[$tag]:$message\n".toByteArray())

class curry {
    @Test
    fun test() {
        log("tag", System.out, "hello World")
        log1("tag")(System.out)("hello World")
        //////////////////////扩展方法//////////////////////////////////////////
        //::  两个冒号是 函数的引用
        ::log.curried()("tag")(System.out)("hello World")
    }
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried() = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this.invoke(p1, p2, p3)