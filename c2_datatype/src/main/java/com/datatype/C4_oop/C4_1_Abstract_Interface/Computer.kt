package com.datatype.C4_oop.C4_1_Abstract_Interface

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice
interface BLEInputDevice : InputDevice


fun main(args: Array<String>) {
    val computer = Computer()
    val mouse = LogitechMouse()
    computer.addInputDevice(mouse)
}

//罗技鼠标鼠标
class LogitechMouse:USBMouse("罗技鼠标"){

}


//鼠标
abstract class USBMouse(val name: String) : USBInputDevice {
    override fun input(event: Any) {

    }
    override fun toString(): String {
        return name
    }
}

//电脑
class Computer {
    private fun addUSBInputDevice(usbInputDevice: USBInputDevice) {
        //插入输入设备
        println("add input device: ${usbInputDevice}")
    }

    private fun addBLEInputDevice(bleInputDevice: BLEInputDevice) {
        //插入输入设备
        println("add input device: $bleInputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        //插入输入设备
        when (inputDevice) {
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice)
            }
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice)
            }
            else -> {
                println("接口不支持")
            }
        }
    }


}