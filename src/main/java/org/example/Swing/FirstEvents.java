package org.example.Swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FirstEvents extends JFrame {
    public FirstEvents() {
        super ("FirstEvents");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new KeyL());
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        new FirstEvents();
                    }
                }
        );
    }

    class KeyL implements KeyListener {
        public void keyTyped(KeyEvent k){
            System.out.println("keyTypedMethod");
        }

        public void keyPressed(KeyEvent e) {
            System.out.println(e);
        }

        public void keyReleased(KeyEvent e) {
            System.out.println(e);
        }
    }
}
