package b1_05;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * Div: A
 * UIN/Roll no. : 231P099/05 */
import java.util.*;

class gcd_1 {
    // Method to calculate the GCD using Euclid's algorithm
    public int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method to run the program
    public static void main(String[] args) {
        gcd_1 gcdCalculator = new gcd_1();
        Scanner sc = new Scanner(System.in);        
       
        int num1;
        int num2;
        System.out.println("Enter 1st Number:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        num2=sc.nextInt();
        int result = gcdCalculator.calculateGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + result);
    }
}

