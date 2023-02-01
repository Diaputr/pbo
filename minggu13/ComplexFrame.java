package minggu14;
import java.awt.Color;
import javax.swing.*;
public class ComplexFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setForeground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(10, 50);
        frame.setSize(300, 100);
        frame.setTitle("Frame Coding Itu Mudah");
    }
}