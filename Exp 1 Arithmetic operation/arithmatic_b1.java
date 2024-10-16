package java_B1_05;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * UIN: 231P099
 * Roll No. 05*/
import java.util.*;
public class arithmatic_b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y, choice;
Scanner sc=new Scanner(System.in);
do{ 
System.out.println("Menu");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Divison");
System.out.println("5. Mod");
System.out.println("6. Exit");
System.out.println("Enter your choice:");
choice = sc.nextInt();

	switch(choice)

      {
      
		  	case 1:
				System.out.println("Input: Addition");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Addition 0f  "+x+ " and "+y+" is : "+(x+y));
				break;   
			case 2:
				System.out.println("Input: Subtraction");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Subtraction 0f "+x+ " and "+y+" is : "+(x-y));
				break;
			case 3:
				System.out.println("Input: Multiplication");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Multiplication 0f  "+x+ " and "+y+" is :"+(x*y));
				break;
			case 4:
				System.out.println("Input: Division");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Division 0f  "+x+ " and "+y+" is :"+(x/y));
				break;
			case 5:
				System.out.println("Input: Modulus");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
			
				System.out.println("Modulus 0f "+x+ " and "+y+" is: "+(x%y));
				break;
			case 6:
				System.out.println("THANK YOU!!!");
				System.exit(0);
				break;
	default:
		System.out.println("Wrong Number");
		break;
      }
	
	}while(choice!=6) ;
}
}
