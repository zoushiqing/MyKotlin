package kolin.mykotlin

import org.junit.Test
import java.util.regex.Pattern

class zhengzebiaoda{
    @Test
    fun test(){
        val source="Hello,This is my phone number:010-12345678."
        //和java 主要是这个地方 RawString
        val pattern=""".*(\d{3}-\d{8}).*"""
        val matcher=Pattern.compile(pattern).matcher(source)
        while (matcher.find()){
            println(matcher.group())
            println(matcher.group(1))
        }
    }
    //Kotlin风格的正则表达式
    @Test
    fun test1(){
        val source="Hello,This is my phone number:010-12345678."
        val pattern=""".*(\d{3}-\d{8}).*"""
        Regex(pattern).findAll(source).toList().flatMap(MatchResult::groupValues).forEach(::println)
    }
}