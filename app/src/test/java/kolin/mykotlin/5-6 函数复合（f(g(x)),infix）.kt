package kolin.mykotlin

import org.junit.Test

/**
 * 中缀表达式 允许调函数 不需要点 也不需要括号
 */
val add5 = { i: Int -> i + 5 }
val mutiplyBy2 = { i: Int -> i * 2 }

infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1):R{
        return function.invoke(this(p1))
    }
}

class compose {
    @Test
    fun test() {
        println(mutiplyBy2(add5(3)))
        /////////////////////函数复合///////////////////////
        val function = add5 andThen mutiplyBy2
        println(function(3))
    }
}