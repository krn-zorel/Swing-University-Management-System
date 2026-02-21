package university.management.system;

import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatDarculaLaf;


public class Project extends JFrame{


    Project(){
        setSize(1540,850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        //Creating the Menu Bar //Start****
        JMenuBar menuBar = new JMenuBar();

        //Menu //1st menu ********
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        menuBar.add(newInformation);

        //This is a dropdown inside JMenu 
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setForeground(Color.WHITE);
        newInformation.add(facultyInfo);

        //This is a dropdown inside JMenu 
        JMenuItem studentInfo = new JMenuItem("New Faculty Information");
        studentInfo.setForeground(Color.WHITE);
        newInformation.add(studentInfo);
        
        setJMenuBar(menuBar); //For menubar there is no add function we use setMenubar //Finish ****



        setVisible(true);
    }
    
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new Project();
        });
    }
}
