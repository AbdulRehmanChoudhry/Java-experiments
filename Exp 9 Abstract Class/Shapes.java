// NAME: Abdulrehman Choudhry
// Roll no: 5
// UIN: 231P099
//BAtch: B1
//Class:SE / Div-A

package SKL_JAVA_B1;
import java.util.*;
abstract class Shape
{
abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape
{ Double l,w;
Rectangle()
{ Scanner sc= new Scanner(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("******Rectangle******");
System.out.println("Enter Length and width of Rectangle");
l=sc.nextDouble();
w=sc.nextDouble();
}

void draw()
{
System.out.println("Area of Rectangle = "+(l*w));
}
}

class Circle extends Shape
{ double r;
Circle() 
{
	Scanner sc= new Scanner(System.in);
System.out.println("******Circle******");
System.out.println("Enter Radius of a Circle");
r=sc.nextDouble();
}
void draw()
{
System.out.println("Area of Circle = "+(3.14*r*r));
}
}
public class Shapes {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		Rectangle d=new Rectangle();

		d.draw();	

	}

}
