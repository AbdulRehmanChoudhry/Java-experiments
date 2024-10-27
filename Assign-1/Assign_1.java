//Abdul Rehman Choudhry
//231P099,05
/*Write a Java program and compute the sum of an integer's digits.*/
import java.util.Scanner;
public class SumOfDigitsExample1 {
public static void main(String args[]) {
int number, digit, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0) {
digit = number % 10;
sum = sum + digit;
number = number / 10;
}
System.out.println("Sum of Digits: "+sum); }
}