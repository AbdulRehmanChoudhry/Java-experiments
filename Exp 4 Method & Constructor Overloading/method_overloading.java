package self_learning;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * Div:A
 * UIN: 231P099
 * Roll No. 05*/
import java.util.*;
class AreaOfMethodOverload
{ double r;
void areaCircle()
{
r=5;
}
void areaCircle(double radious)
{
r=radious;
}
void areaCircle(int radious)
{
r=radious;
}
void display()
{ System.out.println(" Area of Circle : "+(3.14*r*r)); }
}
public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1;
		int r2;

		Scanner sc =new Scanner(System.in);
		AreaOfMethodOverload a=new AreaOfMethodOverload ( );

		a.areaCircle();

		System.out.print("Enter Radius 01:");
		r1 =sc.nextDouble();
		AreaOfMethodOverload b=new AreaOfMethodOverload();
		b.areaCircle(r1);

		System.out.print("Enter Radius 02:");
		r2 =sc.nextInt();
		AreaOfMethodOverload c=new AreaOfMethodOverload();
		c.areaCircle(r2);
		System.out.print("Area of Circle Radius=5 :");
		a.display();
		System.out.print("Area of Circle Radius= :"+r1);
		b.display();
		System.out.print("Area of Circle Radius= :"+r2);
		c.display();

	}

}
