package self_learning;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * Div:A
 * UIN: 231P099
 * Roll No. 05*/
import java.util.*;
public class area_rtc_constov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,l,b,h,ba;
		Scanner sc = new Scanner(System.in);

		System.out.println("For Area of Rectangle : ");
		System.out.println("Enter the Length and Breadth : ");
		l=sc.nextDouble();
		b=sc.nextDouble();
		
		System.out.println("For Area of Triangle : ");
		System.out.println("Enter the Base and Height : ");
		ba=sc.nextFloat();
		h=sc.nextFloat();
		
		System.out.println("For Area of Circle : ");
		System.out.println("Enter the Radius : ");
		r=sc.nextDouble();
		
		
		areaa a1= new areaa(l,b);
		areaa b1= new areaa(ba,h);
		areaa c1= new areaa(r);
	}

}
class areaa
{
	double r,l,b,h,ba;
	

	
	areaa(double l,double b)
	{
		System.out.println("Area of the Rectangle : "+(l*b));
	}
	
	areaa(float ba,float h)
	{
		System.out.println("Area of the Triangle:"+(0.5*b*h));
	}
	areaa(double r)
	{
		System.out.println("Area of the Circle is = "+(3.14*r*r));
	}
	
}