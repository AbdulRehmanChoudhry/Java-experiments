package SKL_OOP_JAVA_B1;
import java.util.*;
/*Aim:Program to implement user defined exception in java  
 * Name: Abdul Rehman Choudhry
 * Roll No: 05
 * UIN: 231P099
 * Class:SE-A */
public class month_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number:");
		n=sc.nextInt();
		try
		{
		if(n>12||n<1)
		throw new ArithmeticException();
		System.out.println("Month number entered is="+n);

		}
		catch(ArithmeticException ae)
		{
		System.out.println("Invalid Number!");
		}

	}

}
