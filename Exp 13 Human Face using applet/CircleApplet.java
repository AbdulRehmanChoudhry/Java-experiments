
//Abdul Rehman Choudhry
//231P099,05
//Write a program to display circle and filled circle using Applet
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class CircleApplet extends Applet {

    public void paint(Graphics g) {
        // Outlined Circle
        g.drawOval(50, 50, 100, 100);  // x, y, width, height
        g.drawString("Outlined Circle", 70, 170);  // Label

        // Filled Circle
        g.setColor(Color.RED);  // Set color to red
        g.fillOval(150, 50, 100, 100);  // x, y, width, height
        g.setColor(Color.BLACK);  // Reset color to black
        g.drawString("Filled Circle", 180, 170);  // Label
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Applet");
        CircleApplet applet = new CircleApplet();

        // Initialize the applet (same as if it were run in a browser)
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

