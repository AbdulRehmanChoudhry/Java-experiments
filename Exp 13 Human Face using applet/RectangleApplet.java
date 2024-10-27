//Abdul Rehman Choudhry
//231P099,05
/*WAP:Write an applet to all four types of rectangle (normal rectangle, filled rectangle, round rectangle,
round corner rectangle and filled round corner rectangle).*/
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class RectangleApplet extends Applet {

    public void paint(Graphics g) {
        // Normal Rectangle (Outlined)
        g.drawRect(50, 50, 100, 60);  // x, y, width, height
        g.drawString("Normal Rectangle", 50, 130);  // Label

        // Filled Rectangle
        g.setColor(Color.BLUE);  // Set color to blue
        g.fillRect(200, 50, 100, 60);  // x, y, width, height
        g.setColor(Color.BLACK);  // Reset color to black
        g.drawString("Filled Rectangle", 200, 130);  // Label

        // Round Rectangle (Outlined)
        g.drawRoundRect(50, 150, 100, 60, 30, 30);  // x, y, width, height, arcWidth, arcHeight
        g.drawString("Round Rectangle", 50, 230);  // Label

        // Filled Round-Corner Rectangle
        g.setColor(Color.RED);  // Set color to red
        g.fillRoundRect(200, 150, 100, 60, 30, 30);  // x, y, width, height, arcWidth, arcHeight
        g.setColor(Color.BLACK);  // Reset color to black
        g.drawString("Filled Round-Corner Rectangle", 200, 230);  // Label
    }

    // Main method to run applet as a Java application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Applet");
        RectangleApplet applet = new RectangleApplet();

        // Initialize the applet (same as if it were run in a browser)
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}