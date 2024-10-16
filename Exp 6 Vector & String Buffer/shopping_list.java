//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO:5
//BRANCH: SE COMPS / div=A
import java.util.*;
public class shopping_list {
    public static void main(String[] args) {

        Vector<String> shoppingList = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nShopping List Operations:");
            System.out.println("1. Add an item at a specified location");
            System.out.println("2. Delete an item");
            System.out.println("3. Print the shopping list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String item = scanner.nextLine();

                    System.out.print("Enter the position (starting from 0): ");
                    int position = scanner.nextInt();

                    if (position >= 0 && position <= shoppingList.size()) {
                        shoppingList.add(position, item);
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the position of the item to delete (starting from 0): ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < shoppingList.size()) {
                        shoppingList.remove(index);
                        System.out.println("Item deleted successfully.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 3:
                    System.out.println("Shopping List:");
                    if (shoppingList.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println(i + ": " + shoppingList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
}
