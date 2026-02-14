package university.management.system;

import javax.swing.*;

public class Splash extends JFrame{

    Splash(){
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
