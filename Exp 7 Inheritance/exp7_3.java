//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO: 5
//BRANCH: SE COMPS / DIV=A

import java.util.Scanner;
class BaseClass2 {
    protected double radius;
    public void acceptData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        System.out.println("Radius accepted in BaseClass: " + radius);
    }
}
class Circle2 extends BaseClass {
    protected double area;
    @Override
    public void acceptData() {
        super.acceptData();  // Call the base class method
        System.out.println("Data accepted and passed to Circle class.");
    }
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
    public void displayArea() {
        System.out.println("Area of the circle: " + area);
    }
}
class Sphere2 extends Circle {
    private double volume;
    @Override
    public void acceptData() {
        super.acceptData();  // Call the Circle class method
        System.out.println("Data accepted and passed to Sphere class.");
    }
    public void calculateVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public void displayVolume() {
        System.out.println("Volume of the sphere: " + volume);
    }
}
public class exp7_3 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.acceptData();
        sphere.calculateArea();
        sphere.displayArea();
        sphere.calculateVolume();
        sphere.displayVolume();
    }   }