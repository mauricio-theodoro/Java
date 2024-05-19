import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;// boas praticas é fazer isso!
    private JPanel panel;

    public GUI(){//construtor
        frame = new JFrame();

        JButton button = new JButton("Click Me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));// é preciso passar um parametro do top do botton left e right
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();// algumas opções do windows
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI(); // construtor para aparecer na tela
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("Number of clicks: " + count);
    }
}