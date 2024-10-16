//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO: 5
//BRANCH: SE COMPS / DIV=A

import java.util.Scanner;

class BaseClass1 {
    protected double radius;

    public void acceptRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
    }
}

class Circle1 extends BaseClass1 {
    protected double area;

    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.println("Area of the circle: " + area);
    }
}

class Sphere1 extends Circle1 {
    private double volume;

    public void calculateVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void displayVolume() {
        System.out.println("Volume of the sphere: " + volume);
    }
}

public class exp7_2 {
    public static void main(String[] args) {
        Sphere1 sphere = new Sphere1();

        sphere.acceptRadius();

        sphere.calculateArea();
        sphere.displayArea();

        sphere.calculateVolume();
        sphere.displayVolume();
    }
}
