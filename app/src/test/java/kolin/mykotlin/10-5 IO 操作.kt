package kolin.mykotlin

import org.junit.Test
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class IOcaozuo {

    @Test
    fun test() {
        val file = File("build.gradle")
        val bufferedReader = BufferedReader(FileReader(file))
        var line: String
        while (true) {
            line = bufferedReader.readLine() ?: break
            println(line)
        }
        bufferedReader.close()
        
        println("        //////////////////////////////////////\n")
        val file1 = File("build.gradle")
        BufferedReader(FileReader(file)).use {
            var line: String
            while (true) {
                line = it.readLine() ?: break
                println(line)
            }
        }
        
        println("        //////////////////////////////////////\n")
        File("build.gradle").readLines().forEach(::println)
    }

}