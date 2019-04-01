package kolin.mykotlin

import org.junit.Test

/**
 * desc:
 */
class xintouying {
    @Test
    fun test() {
        //斜变成Any
        val list: List<*> = listOf(1, 23, 4)
        //逆变 
        val comparable: Comparable<*> = object : Comparable<Any> {
            override fun compareTo(other: Any): Int {
                return 0
            }

        }
    }
}
//不能用 *
