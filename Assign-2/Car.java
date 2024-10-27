/* AIM:Create a Vehicle Management System using Java inheritance
NAME:Abdul Rehman Choudhry
UIN:231P099
ROLL NO:05
*/ // Base class Vehicle class Vehicle {
protected String make;
protected String model;
protected int year;
protected String fuelType;
// Constructor
public Vehicle(String make, String model, int year, String fuelType) {
this.make = make;
this.model = model;
this.year = year;
this.fuelType = fuelType;
}
// Method to start the vehicle
public void start() {
System.out.println("Vehicle is starting.");
}
// Method to stop the vehicle
public void stop() {
System.out.println("Vehicle is stopping.");
}
// Method to display vehicle information
public void displayInfo() {
System.out.println("Make: " + make);
System.out.println("Model: " + model);
System.out.println("Year: " + year);
System.out.println("Fuel Type: " + fuelType);
}
}
// Derived class Car
class Car extends Vehicle {
private int numberOfDoors;
// Constructor
public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
super(make, model, year, fuelType); // Calling parent class constructor
this.numberOfDoors = numberOfDoors;
}
// Overriding start method
@Override
public void start() {
System.out.println("Car is starting with a key.");
}
// Overriding stop method
@Override
public void stop() {
System.out.println("Car is stopping with brakes.");
}
// Method to display car-specific information
@Override
public void displayInfo() {
super.displayInfo(); // Call the parent class method
System.out.println("Number of Doors: " + numberOfDoors);
}
}
// Derived class Motorcycle
class Motorcycle extends Vehicle {
private boolean isSportsBike;
// Constructor
public Motorcycle(String make, String model, int year, String fuelType, boolean isSportsBike)
{
super(make, model, year, fuelType); // Calling parent class constructor
this.isSportsBike = isSportsBike;
}
// Overriding start method
@Override
public void start() {
System.out.println("Motorcycle is starting with an electric ignition.");
}
// Overriding stop method
@Override
public void stop() {
System.out.println("Motorcycle is stopping with hand brakes.");
}
// Method to display motorcycle-specific information
@Override
public void displayInfo() {
super.displayInfo(); // Call the parent class method
System.out.println("Is Sports Bike: " + (isSportsBike ? "Yes" : "No"));
}
}
// Main class to demonstrate the Vehicle Management System
public class VehicleManagementSystem {
public static void main(String[] args) {
// Creating a Car object
Car car = new Car("Toyota", "Camry", 2020, "Gasoline", 4);
car.displayInfo();
car.start();
car.stop();
/* AIM:Create a User Registration System in
Java
NAME:Hussain Shaikh
UIN:231P055 ROLL NO:38 */
import java.util.Scanner;
// Custom exception for invalid age
System.out.println("\n--------------------------------\n");
// Creating a Motorcycle object
Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 2019, "Gasoline", true);
motorcycle.displayInfo();
motorcycle.start();
motorcycle.stop();
}
}