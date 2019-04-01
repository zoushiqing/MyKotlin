package kolin.mykotlin

import com.google.gson.Gson
import org.junit.Test
import java.io.File

/**
 * 1.何为真泛型(c#)
 * 2.何为伪泛型(java,kotlin)
fun needList(list: List<Int>){

}
fun needList(list: List<Double>){

}
以上两种就不行 这就是伪泛型 ，只存在编译之前，编译之后就没有了

 * 3.为什么java当初选择伪泛型?
 *
 */
class fanxinjizhi {
    @Test
    fun test() {
        Gson().toJson(Person5("kotlin", 18)).let {
            File("Person.json").writeText(it)
        }
        needPerson(Gson().fromJson(File("Person.json").readText()))
    }

}

fun needPerson(person: Person5) {

}

data class Person5(var name: String, var age: Int)

inline fun <reified T> Gson.fromJson(json: String): T = fromJson(json, T::class.java)

//具体化之后就能使用了  前面添加一个 inline
inline fun <reified T> testGenerics() {
    println(T::class.java.name)
}