package university.management.system;

import java.awt.Image;

import javax.swing.*;
// import java.awt.*;

public class Splash extends JFrame{

    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        setLocation(150,80);
        setSize(1000, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        // Splash s = new Splash();
        new Splash();


    }
}
