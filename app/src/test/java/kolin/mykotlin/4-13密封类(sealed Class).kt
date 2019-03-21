package kolin.mykotlin

/**
 * 密封类 就是子类 有限的类
 * 1.子类可以定义在自己类的模块中
 * 2.子类也可以定义在当前 kt 文件中
 * 3.但是子类不可以定在其他的 kt 文件中
 */
sealed class PlayerCmd {
    class Play(val ur: String, val position: Long = 0) : PlayerCmd()

    class Seek(val position: Long = 0) : PlayerCmd()

    class Pause : PlayerCmd()

    class Resume : PlayerCmd()

    class Stop : PlayerCmd()

}

class Play(val ur: String, val position: Long = 0) : PlayerCmd()

class Seek(val position: Long = 0) : PlayerCmd()

class Pause : PlayerCmd()

class Resume : PlayerCmd()

class Stop : PlayerCmd()
/////////////////////////////////////////////////////////////////////
//密封类是子类可数
//枚举类是实例可数
//看情况  使用 枚举还是 密封类
enum class PalyerState {
    IDLE, PAUSE, PLAYING
}

class sealedClassDemo {

}
