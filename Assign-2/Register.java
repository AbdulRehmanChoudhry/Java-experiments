/* AIM:Create a User Registration System in Java
NAME:Abdul Rehman Choudhry
UIN:231P099
ROLL NO:05*/
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
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}
// Custom exception for invalid email format
class InvalidEmailFormatException extends Exception {
public InvalidEmailFormatException(String message) {
super(message);
}
}
// Custom exception for invalid password
class InvalidPasswordException extends Exception {
public InvalidPasswordException(String message) {
super(message);
}
}
// User Registration System class
class UserRegistrationSystem {
// Method to register a user
public void registerUser(String name, int age, String email, String password)
throws InvalidAgeException, InvalidEmailFormatException, InvalidPasswordException {
// Check for valid age (must be at least 18)
if (age < 18) {
throw new InvalidAgeException("Age must be 18 or above to register.");
}
// Check for valid email format (must contain '@')
if (!email.contains("@")) {
throw new InvalidEmailFormatException("Invalid email format. Email must
contain '@'.");
}
// Check for valid password length (must be at least 6 characters)
if (password.length() < 6) {
throw new InvalidPasswordException("Password must be at least 6
characters long.");
}
// If no exceptions, registration is successful
System.out.println("User registered successfully!");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Email: " + email);
}
}
// Main class to test the registration system
public class ExceptionHandlingDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
UserRegistrationSystem userSystem = new UserRegistrationSystem();
try {
// User input for registration details
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.print("Enter your age: ");
int age = scanner.nextInt();
/*
AIM:Design a Multithreaded Bank Transaction System in Java
NAME:Hussain Shaikh
UIN:231P039
ROLL NO:38
*/
scanner.nextLine(); // Consume the newline left by nextInt()
System.out.print("Enter your email: ");
String email = scanner.nextLine();
System.out.print("Enter your password: ");
String password = scanner.nextLine();
// Attempt to register the user with the provided details
userSystem.registerUser(name, age, email, password);
} catch (InvalidAgeException | InvalidEmailFormatException |
InvalidPasswordException e) {
// Catch any custom exceptions and display error messages
System.out.println("Registration failed: " + e.getMessage());
} finally {
// Close the scanner resource
scanner.close();
}
}
}