package university.management.system;

import java.awt.Image;

import javax.swing.*;
// import java.awt.*;

import com.formdev.flatlaf.FlatDarculaLaf;

public class Splash extends JFrame implements Runnable{

    Thread t;
    Splash(){
        setLocation(150,80);
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t = new Thread(this);
        t.start();

        
        setVisible(true);

    }

    public void run(){
        try{
            Thread.sleep(5000);
            setVisible(false);

            //Next Frame
            new Login();
        }catch(Exception e){

        }
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }


        SwingUtilities.invokeLater(() -> {
            new Splash();
        });


    }
}
