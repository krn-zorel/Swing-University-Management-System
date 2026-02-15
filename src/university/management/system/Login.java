package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    
    Login(){

        getContentPane().setBackground(Color.GRAY);

        JLabel labelForUsername = new JLabel("Username");
        add(labelForUsername);
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new Login();
    }
}
