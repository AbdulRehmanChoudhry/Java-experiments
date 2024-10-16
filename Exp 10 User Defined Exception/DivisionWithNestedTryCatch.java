package SKL_OOP_JAVA_B1;
import java.util.Scanner;
/*Aim:Write a program to perform division of two numbers accepted from user. Handle the
NumberFormatException and also handle the divide by exception using nested try 
catch block.
Name: Abdul Rehman Choudhry
 * Roll No: 05
 * UIN: 231P099
 * Class:SE-A */
public class DivisionWithNestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine()); 
            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());  

            try {
               
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }

        } catch (NumberFormatException e) {
            
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            scanner.close();  
        }
    }
}