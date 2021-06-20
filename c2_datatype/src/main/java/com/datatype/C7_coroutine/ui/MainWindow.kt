package com.datatype.C7_coroutine.ui

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.event.ActionEvent
import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel

class MainWindow : JFrame() {

    private lateinit var button: JButton
    private lateinit var image: JLabel

    fun init() {
        button = JButton("点我获取腾讯网Logo")
        image = JLabel()
        image.size = Dimension(132, 43)

        contentPane.add(button, BorderLayout.NORTH)
        contentPane.add(image, BorderLayout.CENTER)
    }

    fun onButtonClick(listener: (ActionEvent) -> Unit) {
        button.addActionListener(listener)
    }

    fun setLogo(logoData: ByteArray) {
        image.icon = ImageIcon(logoData)
    }
}