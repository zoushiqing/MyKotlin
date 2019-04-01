package kolin.mykotlin

import org.junit.Test

/**
 * desc:
 * 拿到类
 * 1.类名.class.java
 * 2.对象.class.java
 * 3.对象.javaClass
 */
@PoKo
data class Person2(var age:Int,var name:String)

class Test3{
    @Test
    fun test(){
        val clazz=Person2::class.java

        val person=Person2(12,"jason")
        val clazz3=person::class.java

        
        val clazz2=person.javaClass
        val person2=clazz2.getConstructor(Int::class.java,String::class.java).newInstance(18,"jason")
        println(person2)//Person2(age=18, name=jesson)
        ////////////////////////////////////////////////////////////////////////////////////////////
        val person3=clazz2.newInstance()
        println(person3)//Person2(age=0, name=null)
        ////////////////////////////////////////////////////////////////////////////////////////////
        val name = clazz2.getDeclaredField("name").apply { isAccessible=true }.get(person2)
        println(name)//jason
        ////////////////////////////////////////////////////////////////////////////////////////////
        val name1 = clazz2.getDeclaredMethod("getName").invoke(person2)
        println(name1)//jason
    }
}