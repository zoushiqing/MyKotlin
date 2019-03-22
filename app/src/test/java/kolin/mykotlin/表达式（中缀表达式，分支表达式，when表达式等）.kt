package kolin.mykotlin

/**
 * 1.中缀表达式 只有一个参数，且用infix修饰的函数
 * 2.分支表达式
 */
private const val USERNAME = "kotlin"
private const val PASSWOPD = "jetbrains"

private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWD = "admin"

private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>) {
    val mode = if (args.isNotEmpty() && args[0] == "1") {
        DEBUG
    } else {
        USER
    }

    println("请输入用户名：")
    val username = readLine()
    println("请输入密码")
    val passwd = readLine()

    if (mode == DEBUG && username == ADMIN_USER && passwd == ADMIN_PASSWD) {
        println("管理员登陆成功")
    } else if (username == USERNAME && passwd == PASSWOPD) {
        println("登陆成功")
    } else {
        println("登陆失败")
    }

}


class whenDemo {
    fun main(args: Array<String>) {
        val x = 5
        when (x) {
            is Int -> println("hello $x")
            in 1..100 -> println("$x is in 1..100")
            !in 1..100 -> println("$x is not in 1..100")
            args[0].toInt() -> println("$x == args[0]")
        }
        //when 也是可以有返回值的  有点类似于if  
        val mode = when {
            args.isNotEmpty() && args[0] == "1" -> 1
            else -> {
                0
            }
        }
    }
///////////////////////////////////////////////////////

}