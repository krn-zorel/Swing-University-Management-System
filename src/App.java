import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        frame.add(button);

        frame.setVisible(true);
    }
}
