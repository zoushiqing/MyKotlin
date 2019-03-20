package kolin.mykotlin

import org.junit.Test

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

abstract class USBMouse(var name: String) : USBInputDevice, OpticaMouse {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }

}

class LogitechMouse : USBMouse("罗技鼠标") {

}

interface OpticaMouse {

}

class Computer {
    fun addUSBInputDevice(inputDevice: USBInputDevice) {
        //插入输入设备
        println("add usb input device: $inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice) {
        println("add ble input device: $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is BLEInputDevice -> addBLEInputDevice(inputDevice)
            is USBInputDevice -> addUSBInputDevice(inputDevice)
            else -> {
                throw IllegalArgumentException("输入设备类型不支持")
            }
        }
    }
}

class abstract1 {
    @Test
    fun test() {
        val computer = Computer()
        val mouse = LogitechMouse()
        computer.addInputDevice(mouse)
    }
}

///////////////////////////////////////////////////////
abstract class A1 {
    var i = 0
    fun hello() {
        println(i)
    }
}

/**
 * kotlin中的接口中的函数可以提前实现了
 */
interface B1 {
    var j: Int
    fun hello() {
        println(j)
    }

    fun hello1()
}

/**
 * kotlin中实现接口 必须给接口中的属性 和 方法都得实现了
 */
open class C1(override var j: Int) : B1 {

    override fun hello1() {

    }
}

interface E
/**
 * 单继承 多实现
 */
class D1 : C1(1), E, B1 {}
