package java_prac1;
import java.util.*;
import java_prac.Factorial;
public class FactorialMain {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter a number to calculate its factorial: ");
		int number = scanner.nextInt(); 
		Factorial factorialCalculator = new Factorial(); 
		try { 
		long result = factorialCalculator.calculateFactorial(number);
		System.out.println("The factorial of " + number + " is: " + result); 
		} catch (IllegalArgumentException e) { 
		System.out.println(e.getMessage()); 
		} 
		} 
}
