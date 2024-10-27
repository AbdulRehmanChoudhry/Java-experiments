package java_prac1;
import java.util.Scanner; 
import java_prac.Add;
public class addNumbers {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter number 1: "); int 
		num1 = sc.nextInt(); 
		System.out.println("Enter number 2: "); int 
		num2 = sc.nextInt(); 
		Add adder = new Add(); 
		int result = adder.add(num1, num2); 
		System.out.println("The result is: " + result); 
		}
}
