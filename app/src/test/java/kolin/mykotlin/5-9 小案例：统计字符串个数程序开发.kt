package kolin.mykotlin

import org.junit.Test
import java.io.File

/**
 * desc:
 */

class xiaoanli {
    @Test
    fun test() {
        val map = HashMap<Char, Int>()
        File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
            val count = map[it]
            if (count == null) map[it] = 1
            else map[it]=count+1
        }
        map.forEach(::println)
    }
}