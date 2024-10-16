//NAME: Abdul Rehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO: 05
//BRANCH: SE COMPS / DIV=A
import java.util.Scanner;
import java.util.Vector;
import java.util.Enumeration;

public class vector {

    // Vector to store student names
    private Vector<String> students = new Vector<>();

    // Method to add student name
    public void addStudent(String name) {
        students.add(name);
        System.out.println("Student " + name + " added.");
    }

    // Method to remove student name
    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display all students using Enumeration
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            Enumeration<String> e = students.elements();
            System.out.println("Student List:");
            while (e.hasMoreElements()) {
                System.out.println(e.nextElement());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         vector sv = new vector();
        int choice;

        // Menu for user to choose operations
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add student name");
            System.out.println("2. Remove student name");
            System.out.println("3. Display student names");
            System.out.println("4. Exit");

            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = sc.nextLine();
                    sv.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = sc.nextLine();
                    sv.removeStudent(nameToRemove);
                    break;
                case 3:
                    sv.displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
}
}