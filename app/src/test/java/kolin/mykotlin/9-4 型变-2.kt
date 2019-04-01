package kolin.mykotlin

import org.junit.Test
import java.math.BigDecimal

/**
 * desc:泛型实参的集成关系 对 泛型的影响
 */
class fanxing2 {
    @Test
    fun test() {
        //反证法
        val mutableList: MutableList<Number> = mutableListOf(1, 2, 3, 4)
        mutableList.add(BigDecimal("123"))
        
    }
}