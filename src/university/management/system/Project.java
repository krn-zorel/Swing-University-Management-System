package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Project extends JFrame{


    Project(){
        setSize(1540,850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        //Creating the Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        menuBar.add(newInformation);
        
        setJMenuBar(menuBar); //For menubar there is no add function we use setMenubar



        setVisible(true);
    }
    
    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> {
            new Project();
        });
    }
}
