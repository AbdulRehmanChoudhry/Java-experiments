
import java.sql.*;
import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> updateContact();
                case 4 -> deleteContact();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Method to Add a Contact
    private static void addContact() {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO contacts (name, phone, email, address) VALUES (?, ?, ?, ?)")) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setString(3, email);
            stmt.setString(4, address);

            stmt.executeUpdate();
            System.out.println("Contact added successfully!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to View All Contacts
    private static void viewContacts() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM contacts")) {

            System.out.println("\nID | Name | Phone | Email | Address");
            while (rs.next()) {
                System.out.printf("%d | %s | %s | %s | %s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to Update a Contact
    private static void updateContact() {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "UPDATE contacts SET name = ?, phone = ?, email = ?, address = ? WHERE id = ?")) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Contact ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter New Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Enter New Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter New Address: ");
            String address = scanner.nextLine();

            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setString(3, email);
            stmt.setString(4, address);
            stmt.setInt(5, id);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Contact updated successfully!");
            } else {
                System.out.println("Contact not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to Delete a Contact
    private static void deleteContact() {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM contacts WHERE id = ?")) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Contact ID to delete: ");
            int id = scanner.nextInt();

            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Contact deleted successfully!");
            } else {
                System.out.println("Contact not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

