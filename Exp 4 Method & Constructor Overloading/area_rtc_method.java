package self_learning;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * Div:A
 * UIN: 231P099
 * Roll No. 05*/
import java.util.*;

public class area_rtc_method {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int length, breath;
		double height, base;
		int radius;
		
		Area obj1 = new Area();
		System.out.println("For Area of Rectangle : ");
		System.out.println("Enter length : ");
		length = sc.nextInt();
		System.out.println("Enter breath : ");
		breath = sc.nextInt();
		obj1.area(length, breath);
		obj1.display1();
	
		Area obj2 = new Area();
		System.out.println("For Area of Triangle : ");
		System.out.println("Enter height: ");
		height = sc.nextDouble();
		System.out.println("Enter base : ");
		base = sc.nextDouble();
		obj2.area(height, base);
		obj2.display2();
		
		
		Area obj3 = new Area();
		System.out.println("For Area of Circle : ");
		System.out.println("Enter radius : ");
		radius = sc.nextInt();
		obj3.area(radius);
		obj3.display3();
	}

}

class Area 
{
	double result1;
	double result2;
	double result3;
	Scanner sc =new Scanner(System.in);
		
	// Area of Rectangle
	void area(int length , int breath)
	{	
		result1 = (length * breath);
	}
	
	// Area of Triangle
	void area(double height, double base)
	{
		result2 = (height * base)/2;
	}
	
	// Area Circle
	void area( int radius)
	{
		result3 = 3.14*radius*radius;			
	}
				
	void display1()
	{
		System.out.println("The area of the rectangle is : "+result1);			
	}
				
	void display2()
	{
		System.out.println("The area of the triangle is : "+result2);
	}
		
	void display3()
	{
		System.out.println("The area of the circle is : "+result3);	
	}	
}