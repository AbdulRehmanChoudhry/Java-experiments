package java_prac1;

import java_prac.Compare;

public class Demo {
	public static void main(String args[]) { 
		int n = 500, m = 20; 
		Compare current = new Compare(n, m); 
		if (n != m)
		{ 
			current.getmax(); 
		} 
		else { 
			System.out.println("Both the values are same"); 
		} 
	} 
}
