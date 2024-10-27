//Abdul Rehman Choudhry
//231P099,05
/*aim:Create a class Student with private attributes for name and age.
Use a constructor to initialize these attributes and provide public getter
methods to access them.In the main method, an instance of Student is created,
and the student's details are printed.*/
import java.util.Scanner;
class Student {
 private String name;
 private int age;
 public Student(String studentName, int studentAge) {
 name = studentName;
 age = studentAge;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the information:");
 String name = scanner.nextLine();
 int age = scanner.nextInt();
 Student student = new Student(name, age);
 System.out.println("Student Name: " + student.getName());
 System.out.println("Student Age: " + student.getAge());

 }
}
/