package kolin.mykotlin

/**
 * 高阶函数就是把函数作为参数或者返回值一类的函数
 * f(g(x))
 * 1.引用一个高级方法直接 ::方法名
 * 2.引用一个成员方法直接 类名::方法名
 *
 */
fun main(args: Array<String>) {
    //第一种
    args.forEach(::println)
    val helloWorld = Hello::world
    //第二种 隐含参数 为调用者本身
    args.filter(String::isNotEmpty)
    ///////////////////////////////////////////////////
    //第三种
    args.forEach(PdfPrinter()::println)
}

class PdfPrinter {
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

class Hello {
    fun world() {
        println("Hello World.")
    }
}

class gaojieFunction {

}