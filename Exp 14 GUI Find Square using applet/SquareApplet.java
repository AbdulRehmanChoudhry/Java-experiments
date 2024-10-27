//Abdul Rehman Choudhry
//231P099,05
//Write a program to find square of a given number using applet.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SquareApplet extends JApplet implements ActionListener {
    // Declaring components
    private Label label;
    private TextField inputField;
    private Button squareButton;
    private String result = "";

    @Override
    public void init() {
        // Setting layout and adding components
        setLayout(new FlowLayout());

        label = new Label("Enter a number: ");
        add(label);

        inputField = new TextField(10);
        add(inputField);

        squareButton = new Button("Find Square");
        add(squareButton);

        // Adding action listener to the button
        squareButton.addActionListener(this);
    }

    // Action performed when the button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get the input from the text field and calculate the square
            int number = Integer.parseInt(inputField.getText());
            int square = number * number;
            result = "Square of " + number + " is " + square;
        } catch (NumberFormatException ex) {
            // Handle invalid input
            result = "Please enter a valid number.";
        }

        // Repaint the applet to display the result
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        // Display the result
        g.drawString(result, 50, 150);
    }

    public static void main(String[] args) {
        // Create a JFrame to hold the applet
        JFrame frame = new JFrame("Square Applet");
        SquareApplet applet = new SquareApplet();

        // Initialize the applet (same as if it were run in a browser)
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}