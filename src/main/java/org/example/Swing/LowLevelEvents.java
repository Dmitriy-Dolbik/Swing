package org.example.Swing;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class LowLevelEvents extends JFrame {
    private JTextArea out = new JTextArea();
    public LowLevelEvents() {
        super("LowLevelEvents");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JScrollPane(out));

        JButton button = new JButton("Источник событий");
        add(button, "South");

        OurListener o1 = new OurListener();

        button.addKeyListener(o1);
        button.addMouseListener(o1);
        button.addMouseMotionListener(o1);
        button.addMouseWheelListener(o1);
        button.addFocusListener(o1);
        setSize(400, 300);
        setVisible(true);
    }
    class OurListener implements MouseListener,
            KeyListener, MouseMotionListener,
            MouseWheelListener, FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            out.append("focusGained" + "\n");
        }

        @Override
        public void focusLost(FocusEvent e) {
            out.append("focusLost" + "\n");
        }

        @Override
        public void keyTyped(KeyEvent e) {
            out.append("keyTyped" + "\n");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            out.append("keyPressed" + "\n");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            out.append("keyReleased" + "\n");
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            out.append("mouseClicked" + "\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            out.append("mousePressed" + "\n");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            out.append("mouseReleased" + "\n");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            out.append("mouseEntered" + "\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            out.append("mouseExited" + "\n");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            out.append("mouseDragged" + "\n");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            out.append("mouseMoved" + "\n");
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            out.append("mouseWheelMoved" + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LowLevelEvents();
            }
        });
    }
}
