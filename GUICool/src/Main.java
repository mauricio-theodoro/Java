import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{

    private static  JLabel userLabel;
    private static  JTextField userText;
    private static  JLabel passwordLabel;
    private static  JButton button;
    private static  JPasswordField passwordText;
    private static JLabel success;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();//e para é para os elementos que vamos colocar dentro
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Main());
        panel.add(button);


        frame.setVisible(true); // frame o construtor de toda a borda

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);
        if(user.equals("Mauricio") && password.equals("12345678")){
            success.setText("Login successful!");
        }
        else if(password.isEmpty()){
            success.setText("Password Empty");
        }
        //System.out.println("Button clicked"); // teste
    }
}