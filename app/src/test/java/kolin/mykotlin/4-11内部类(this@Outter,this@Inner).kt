package kolin.mykotlin

/**
 *1、 kotlin中 默认是静态内部类
 * 2、如果要设置为非静态内部类  加一个 inner 即可
 * 3、如果内部实例 必须依赖外部类 就使用非静态
 */
class OuterClass {
    val i = 0

    inner class InnerClass {
        val i = 1
        fun hello() {
            println(this@OuterClass.i)
        }
    }
}

interface onClickListener {
    fun onClick()
}

class View {
    var onClickListener: onClickListener? = null

}

fun main(args: Array<String>) {
    val inner = OuterClass().InnerClass()
    ////////////////////////////////////////////////

    val view = View()
    //这就是所谓的匿名内部类
    view.onClickListener = object : onClickListener {
        override fun onClick() {

        }

    }
}