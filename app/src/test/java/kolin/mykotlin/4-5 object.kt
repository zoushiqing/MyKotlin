package kolin.mykotlin

/**
 * 用object 修饰单利
 * 1.可以继承父类  可以实现接口
 * 
 */
class Driver1 {

}

interface OnExternalDriverMountListener {
    fun onMount(driver1: Driver1)
    fun onUnmount(driver1: Driver1)
}
abstract class Player
object Music :Player(), OnExternalDriverMountListener {
    val state: Int = 0
    fun play(url: String) {

    }

    fun stop() {

    }

    override fun onMount(driver1: Driver1) {
    }

    override fun onUnmount(driver1: Driver1) {
    }
}
