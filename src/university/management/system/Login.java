package university.management.system;


import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatDarkLaf;

public class Login extends JFrame{
    
    Login(){
        //Window Color and Setting the layout to null
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        //Window
        setSize(600,300);
        // setLocation(500,250); //Obsolete code
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Username Label
        JLabel labelForUsername = new JLabel("Username");
        labelForUsername.setBounds(50,50,100,20);
        labelForUsername.setBackground(Color.WHITE);
        add(labelForUsername);

        //Username Input
        JTextField inputForUsername = new JTextField();
        inputForUsername.setBounds(130,50,100,20);
        add(inputForUsername);


        //Password Label
        JLabel labelForPassword = new JLabel("Password");
        labelForPassword.setBounds(50,100,100,20);
        labelForPassword.setBackground(Color.WHITE);
        add(labelForPassword);

        //Password Input
        JPasswordField inputForPassword = new JPasswordField();
        inputForPassword.setBounds(130,100,100,20);
        add(inputForPassword);

        //Best Practice to render this at last
        setVisible(true);

    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // new Login(); //Obsolete
        //Modern and Safe
        SwingUtilities.invokeLater(() -> {
            new Login();
        });
    }
}
