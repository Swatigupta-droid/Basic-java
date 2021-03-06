import javax.swing.*;
import java.awt.*;

public class Frame {
    public Frame() {
        JFrame frame = new JFrame();
        JLabel helloworld = new JLabel("Hello World!", SwingConstants.CENTER);

        frame.setSize(300, 300);
        frame.add(helloworld, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }
}