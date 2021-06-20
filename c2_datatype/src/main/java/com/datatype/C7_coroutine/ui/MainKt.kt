package com.datatype.C7_coroutine.ui

import com.datatype.C7_coroutine.async.*
import com.datatype.C7_coroutine.common.log
import javax.swing.JFrame.EXIT_ON_CLOSE

const val LOGO_URL = "http://www.imooc.com/static/img/index/logo.png?t=1.1"

fun main(args: Array<String>) {

    val frame = MainWindow()
    frame.title = "vero"
    frame.setSize(200, 150)
    frame.isResizable = true
    frame.defaultCloseOperation = EXIT_ON_CLOSE
    frame.init()
    frame.isVisible = true

    frame.onButtonClick {
        log("协程之前")
        startCoroutine(DownloadContext(LOGO_URL)) {
            log("协程开始")
//            val imageData = startPic(LOGO_URL)

//            val imageData = haoshi {
            val imageData = haoshi2 {
                startPic2(this[DownloadContext]!!.url)
            }
            log("拿到图片")
            frame.setLogo(imageData)
        }
        log("协程之后")
    }


}