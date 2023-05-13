import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        JLabel userLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // empty cell for spacing
        panel.add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());
                if (isValidLogin(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
    private static boolean isValidLogin(String username, String password) {
        // Add your own logic here to validate the login
        return username.equals("admin") && password.equals("password");
    }
}
