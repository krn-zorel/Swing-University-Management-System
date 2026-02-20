package university.management.system;

import javax.swing.*;

public class Project extends JFrame{


    Project(){
        setSize(1540,850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        setVisible(true);

    }
    
    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> {
            new Project();
        });
    }
}
