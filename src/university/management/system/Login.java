package university.management.system;



import javax.swing.*;
import java.awt.*;
// import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatDarculaLaf;

public class Login extends JFrame{
    
    Login(){
        //Window Color and Setting the layout to null
        // getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        //Window
        setSize(600,300);
        // setLocation(500,250); //Obsolete code
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Username Label
        JLabel labelForUsername = new JLabel("Username");
        labelForUsername.setBounds(50,50,100,20);
        // labelForUsername.setBackground(Color.WHITE);
        add(labelForUsername);

        //Username Input
        JTextField inputForUsername = new JTextField();
        inputForUsername.setBounds(130,50,100,20);
        add(inputForUsername);


        //Password Label
        JLabel labelForPassword = new JLabel("Password");
        labelForPassword.setBounds(50,100,100,20);
        // labelForPassword.setBackground(Color.WHITE);
        add(labelForPassword);

        //Password Input
        JPasswordField inputForPassword = new JPasswordField();
        inputForPassword.setBounds(130,100,100,20);
        add(inputForPassword);

        //Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(40,140,120,30);
        loginButton.setForeground(Color.PINK);
        loginButton.setFont(new Font("serif",Font.BOLD,16));
        add(loginButton);


        //Cancel Button
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(180,140,120,30);
        cancelButton.setForeground(Color.PINK);
        cancelButton.setFont(new Font("serif",Font.BOLD,16));
        add(cancelButton);

        //add the image for login below
        //***************/


        //Best Practice to render this at last
        setVisible(true);

    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }


        
        SwingUtilities.invokeLater(() -> {
            new Login();
        });
    }
}
