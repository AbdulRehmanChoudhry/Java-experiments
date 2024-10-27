/*
AIM:Create a Simple Calculator GUI in Java using Swing
// Create threads for depositing and withdrawing money
Thread depositThread1 = new Thread(new DepositTask(account, 500), "Thread-1");
Thread depositThread2 = new Thread(new DepositTask(account, 300), "Thread-2");
Thread withdrawThread1 = new Thread(new WithdrawTask(account, 400), "Thread3");
Thread withdrawThread2 = new Thread(new WithdrawTask(account, 800), "Thread4");
// Start all threads
depositThread1.start();
depositThread2.start();
withdrawThread1.start();
withdrawThread2.start();
// Ensure all threads complete before showing the final balance
try {
depositThread1.join();
depositThread2.join();
withdrawThread1.join();
withdrawThread2.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
// Display the final balance after all transactions
System.out.println("Final balance: " + account.getBalance());
}
}
NAME:Abdul Rehman Choudhry
UIN:231P099
ROLL NO:05
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Calculator class extending JFrame
public class CalculatorGUI extends JFrame implements ActionListener {
// Components of the calculator
private JTextField display;
private JButton[] numberButtons;
private JButton[] functionButtons;
private JButton addButton, subButton, mulButton, divButton;
private JButton decButton, eqButton, clrButton, delButton;
private JPanel panel;
private Font font = new Font("Arial", Font.PLAIN, 20);
private double num1 = 0, num2 = 0, result = 0;
private char operator;
// Constructor to set up the calculator GUI
public CalculatorGUI() {
// Set up the frame
setTitle("Simple Calculator");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(420, 550);
setLayout(null);
// Create display field
display = new JTextField();
display.setBounds(50, 25, 300, 50);
display.setFont(font);
display.setEditable(false);
add(display);
// Initialize number buttons
numberButtons = new JButton[10];
for (int i = 0; i < 10; i++) {
numberButtons[i] = new JButton(String.valueOf(i));
numberButtons[i].addActionListener(this);
numberButtons[i].setFont(font);
numberButtons[i].setFocusable(false);
}
// Initialize function buttons
addButton = new JButton("+");
subButton = new JButton("-");
mulButton = new JButton("*");
divButton = new JButton("/");
decButton = new JButton(".");
eqButton = new JButton("=");
clrButton = new JButton("C");
delButton = new JButton("Del");
functionButtons = new JButton[] {addButton, subButton, mulButton, divButton,
decButton, eqButton, clrButton, delButton};
// Add action listeners to function buttons
for (JButton button : functionButtons) {
button.addActionListener(this);
button.setFont(font);
button.setFocusable(false);
}
// Create panel to add buttons in grid layout
panel = new JPanel();
panel.setBounds(50, 100, 300, 400);
panel.setLayout(new GridLayout(4, 4, 10, 10));
// Add buttons to panel
panel.add(numberButtons[1]);
panel.add(numberButtons[2]);
panel.add(numberButtons[3]);
panel.add(addButton);
panel.add(numberButtons[4]);
panel.add(numberButtons[5]);
panel.add(numberButtons[6]);
panel.add(subButton);
panel.add(numberButtons[7]);
panel.add(numberButtons[8]);
panel.add(numberButtons[9]);
panel.add(mulButton);
panel.add(decButton);
panel.add(numberButtons[0]);
panel.add(eqButton);
panel.add(divButton);
// Add components to the frame
add(panel);
clrButton.setBounds(150, 500, 100, 50);
delButton.setBounds(250, 500, 100, 50);
add(clrButton);
add(delButton);
setVisible(true);
}
// Method to handle button actions
@Override
public void actionPerformed(ActionEvent e) {
for (int i = 0; i < 10; i++) {
if (e.getSource() == numberButtons[i]) {
display.setText(display.getText() + i);
}
}
if (e.getSource() == decButton) {
display.setText(display.getText() + ".");
}
if (e.getSource() == addButton) {
num1 = Double.parseDouble(display.getText());
operator = '+';
display.setText("");
}
if (e.getSource() == subButton) {
num1 = Double.parseDouble(display.getText());
operator = '-';
display.setText("");
}
if (e.getSource() == mulButton) {
num1 = Double.parseDouble(display.getText());
operator = '*';
display.setText("");
}
if (e.getSource() == divButton) {
num1 = Double.parseDouble(display.getText());
operator = '/';
display.setText("");
}
if (e.getSource() == eqButton) {
}
num2 = Double.parseDouble(display.getText());
switch (operator) {
case '+':
result = num1 + num2;
break;
case '-':
result = num1 - num2;
break;
case '*':
result = num1 * num2;
break;
case '/':
if (num2 != 0) {
result = num1 / num2;
} else {
display.setText("Error");
return;
}
break;
}
display.setText(String.valueOf(result));
num1 = result;
}
if (e.getSource() == clrButton) {
display.setText("");
}
if (e.getSource() == delButton) {
String text = display.getText();
display.setText(text.substring(0, text.length() - 1));
}
// Main method to launch the calculator
public static void main(String[] args) {
new CalculatorGUI();
}
}