//Abdul Rehman Choudhry
//231P099,05
//Write an applet using ActionEvent and textfield to find largest between three numbers.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LargestNumberCalculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, num3Field, resultField;
    private JButton findLargestButton;

    public LargestNumberCalculator() {
        // Set up the frame
        setTitle("Largest Number Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create text fields
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        num3Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Result field is not editable

        // Create button
        findLargestButton = new JButton("Find Largest");
        findLargestButton.addActionListener(this);

        // Add components to the frame
        add(new JLabel("Number 1:"));
        add(num1Field);
        add(new JLabel("Number 2:"));
        add(num2Field);
        add(new JLabel("Number 3:"));
        add(num3Field);
        add(findLargestButton);
        add(new JLabel("Largest Number:"));
        add(resultField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get numbers from text fields
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double num3 = Double.parseDouble(num3Field.getText());

            // Find the largest number
            double largest = Math.max(num1, Math.max(num2, num3));
            resultField.setText(String.valueOf(largest));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        // Create the GUI
        SwingUtilities.invokeLater(() -> {
            LargestNumberCalculator calculator = new LargestNumberCalculator();
            calculator.setVisible(true);
        });
    }
}