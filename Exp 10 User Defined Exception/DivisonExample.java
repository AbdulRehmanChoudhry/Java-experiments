package SKL_OOP_JAVA_B1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Aim:Write a program to perform division of two numbers accepted from user.
 *  Handle the IOException, NumberFormatException and also handle the divide 
 *  by exception using multiple try catch block.*
  
 * Name: Abdul Rehman Choudhry
 * Roll No: 05
 * UIN: 231P099
 * Class:SE-A */

public class DivisonExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter the first number: ");
            String firstInput = reader.readLine();
            System.out.print("Enter the second number: ");
            String secondInput = reader.readLine();

            try {
                
                int num1 = Integer.parseInt(firstInput);
                int num2 = Integer.parseInt(secondInput);

                try {
                
                    int result = num1 / num2;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    
                    System.out.println("Error: Cannot divide by zero.");
                }

            } catch (NumberFormatException e) {
               
                System.out.println("Error: Please enter valid numbers.");
            }

        } catch (IOException e) {
           
            System.out.println("Error: An I/O error occurred.");
        }
    }
}