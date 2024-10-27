//Abdul Rehman Choudhry
//231P099,05
//Write a program to display Human Face using applet.
import java.awt.*;
import javax.swing.*;

public class HumanFaceFrame extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the color for the face
        g.setColor(Color.YELLOW);

        // Draw the face (Oval)
        g.fillOval(100, 100, 200, 200); // x, y, width, height

        // Set the color for the eyes
        g.setColor(Color.BLACK);

        // Draw the eyes (Ovals)
        g.fillOval(150, 150, 30, 30); // Left eye
        g.fillOval(220, 150, 30, 30); // Right eye

        // Draw the nose (Line)
        g.drawLine(200, 180, 200, 220); // Nose

        // Set the color for the mouth
        g.setColor(Color.RED);

        // Draw the mouth (Arc)
        g.drawArc(150, 230, 100, 50, 0, -180); // x, y, width, height, startAngle, arcAngle
    }

    public static void main(String[] args) {
        // Create a frame to display the face
        JFrame frame = new JFrame("Human Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create an instance of the JPanel subclass (where the face is drawn)
        HumanFaceFrame facePanel = new HumanFaceFrame();

        // Add the panel to the frame
        frame.add(facePanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}