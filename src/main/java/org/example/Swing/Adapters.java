package org.example.Swing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Adapters extends JFrame {
    public Adapters() {
        super("Adapters");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new MouseL());
        setSize(200, 200);
        setVisible(true);
    }

    class MouseL extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new Adapters();
                    }
                }
        );
    }
}
