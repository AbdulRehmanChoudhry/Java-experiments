//Abdul Rehman Choudhry
//231P099,05
/*Create a simple Java application to manage a contact list using the
Vector class.*/
import java.util.*;
public class ContactManager {
 public static void main(String[] args) {
 Vector<String[]> contacts = new Vector<>();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nContact List Menu:");
 System.out.println("1. Add a Contact");
 System.out.println("2. Remove a Contact");
 System.out.println("3. Display All Contacts");
 System.out.println("4. Search for a Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter contact name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 contacts.add(new String[]{name, phoneNumber});
 System.out.println("Contact added.");
 break;
 case 2:
 System.out.print("Enter the name of the contact to remove: ");
 String nameToRemove = scanner.nextLine();
 boolean removed = false;
 for (int i = 0; i < contacts.size(); i++) {
 if (contacts.get(i)[0].equalsIgnoreCase(nameToRemove)) {
 contacts.remove(i);
 System.out.println("Contact removed.");
 removed = true;
 break;}
 }
 if (!removed) {
 System.out.println("Contact not found.");
 }
 break;
 case 3:
 System.out.println("Contact List:");
 if (contacts.isEmpty()) {
 System.out.println("No contacts available");
 } else {
 for (String[] contact : contacts) {
 System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);}
 }
 break;
 case 4:
 System.out.print("Enter the name to search: ");
 String nameToSearch = scanner.nextLine();
 boolean found = false;
 for (String[] contact : contacts) {
 if (contact[0].equalsIgnoreCase(nameToSearch)) {
 System.out.println("Found Contact - Name: " + contact[0] + ", Phone: " + contact[1]);
 found = true;
 break;}
 }
 if (!found) {
 System.out.println("Contact not found.");
 }
 break;
 case 5:

 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");}
 } while (choice != 5);
 scanner.close();}
}