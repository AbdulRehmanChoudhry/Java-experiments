package java_prac;

public class Factorial {
	public long calculateFactorial(int n) { 
		if (n < 0) { 
		throw new IllegalArgumentException("Factorial is not defined for negative numbers."); 
		} 
		long factorial = 1; 
		for (int i = 1; i <= n; i++) { 
		factorial *= i; 
		} 
		return factorial; 
		}
}
