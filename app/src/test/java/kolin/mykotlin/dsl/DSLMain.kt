package kolin.mykotlin.dsl

import org.junit.Test

/**
 * desc:
 */
class DSLMain{
    @Test
    fun test(){
        html{ 
            "id"("HtmlId")
            "head"{
                "id"("HeadId")
            }
            body{
                id="bodyId"
                `class`="BodyClass"
                "a"{
                    "href"("https://www.baidu.com")
                    +"Koltin 中文博客"
                }
            }
        }.render().let(::println)
    }
}