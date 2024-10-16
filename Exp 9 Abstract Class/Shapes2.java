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
{ Double r1;
Rectangle()
{ Scanner sc= new Scanner(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("******SPHERE******");
System.out.println("Enter radius of sphere: ");
r1=sc.nextDouble();

}

void draw()
{
System.out.println("volume of sphere = "+(1.33*3.14*r1*r1*r1));
;
}
}

class Circle extends Shape
{ double r;
Circle() 
{
	Scanner sc= new Scanner(System.in);
System.out.println("******Hemisphere******");
System.out.println("Enter Radius of a hemisphere");
r=sc.nextDouble();
}
void draw()
{
System.out.println("Area of Circle = "+(0.66*3.14*r*r*r));
}
}
public class Shapes2 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		Rectangle d=new Rectangle();

		d.draw();	

	}

}
