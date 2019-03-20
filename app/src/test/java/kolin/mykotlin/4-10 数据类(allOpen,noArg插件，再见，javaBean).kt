package kolin.mykotlin

import org.junit.Test

/**
 * 会生成以下方法
 * getId()
 * getName()
 * 
 * component1()
 * component2()
 * toString()
 * 
 * hashCode()
 * equals(Object var1)
 * public final Country copy(int id, @NotNull String name)
 */
/**
 * 注意：
 * 由于没有默认的无参构造函数  所以不能直接拿来作为javaBean使用
 * 所以官方出了两个插件 
 * classpath "org.jetbrains.kotlin:kotlin-noarg:$kotlin_version"
 * classpath "org.jetbrains.kotlin:kotlin-allopen:$kotlin_version"
 */
data class Country(val id: Int, val name: String)

class ComponentX{
    operator fun component1():String{
        return "我是"
    }
    operator fun component2():Int{
        return 1
    }
    operator fun component3():Int{
        return 1
    }
    operator fun component4():Int{
        return 0
    }
}
class dataTest {
    @Test
    fun test() {
        val china = Country(0, "中国")
        println(china)
        println(china.component1())
        println(china.component2())
        
        val (id,name)=china//这里调用的就是 component1 component2
        println(id)
        println(name)
        //自定义
        val componentX=ComponentX()
        val (a,b,c,d)=componentX
        println("$a$b$c$d")
    }
}