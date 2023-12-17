package functional_programming

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame

/**
 * @author : LEX_YU
 */
fun main() {
    val frame = JFrame("Button Demo")

    val button: JButton? = JButton("Click me")

    button?.addActionListener {
        println("Button clicked!")
        frame.dispose()
    }

    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.contentPane.add(button)

    frame.setSize(300, 200)
    frame.isVisible = true
    frame.setLocationRelativeTo(null)
}