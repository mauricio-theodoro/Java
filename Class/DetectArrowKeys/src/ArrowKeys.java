import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {
    public ArrowKeys(){
        JFrame frame = new JFrame();
        frame.setVisible(true); // Fazendo o GUI ficar visivel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quando fechar o programa. vai ter essa ação
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();
        // adicionando no panel
        panel.add(up);
        panel.add(down);
        panel.add(right);
        panel.add(left);

        up.setText("Up: 0");
        down.setText("Down: 0");
        right.setText("Right: 0");
        left.setText("Left: 0");

        frame.addKeyListener(new KeyListener() {
            int upCount = 0;
            int downCount = 0;
            int rightCount = 0;
            int leftCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch(keycode){
                    case KeyEvent.VK_UP:
                        up.setText("Up: " + Integer.toString(upCount++));
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: " + Integer.toString(downCount++));
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: " + Integer.toString(rightCount++));
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: " + Integer.toString(leftCount++));
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(panel);

    }
    public static void main(String[] args) {
        new ArrowKeys();

    }

}