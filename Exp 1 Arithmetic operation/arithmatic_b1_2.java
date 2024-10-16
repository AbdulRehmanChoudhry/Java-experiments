package java_B1_05;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * UIN: 231P099
 * Roll No. 05*/
import java.util.*;
public class arithmatic_b1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y, choice;
Scanner sc=new Scanner(System.in);
do{ 
System.out.println("Menu");
System.out.println("+ = Addition");
System.out.println("- = Subtraction");
System.out.println("* = Multiplication");
System.out.println("/ = Divison");
System.out.println("% = Mod");
System.out.println("$ = Exit");
System.out.println("Enter your choice:");
choice = sc.next().charAt(0);

	switch(choice)

      {
      
		  	case '+':
				System.out.println("Input: Addition");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Addition 0f  "+x+ " and "+y+" is : "+(x+y));
				break;   
			case '-':
				System.out.println("Input: Subtraction");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Subtraction 0f "+x+ " and "+y+" is : "+(x-y));
				break;
			case '*':
				System.out.println("Input: Multiplication");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Multiplication 0f  "+x+ " and "+y+" is :"+(x*y));
				break;
			case '/':
				System.out.println("Input: Division");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Division 0f  "+x+ " and "+y+" is :"+(x/y));
				break;
			case '%':
				System.out.println("Input: Modulus");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Modulus 0f "+x+ " and "+y+" is: "+(x%y));
				break;
			case '$':
				System.out.println("THANK YOU!!!");
				System.exit(0);
				break;
	default:
		System.out.println("Wrong Number");
		break;
      }
	
	}while(choice!='$') ;
}
}
