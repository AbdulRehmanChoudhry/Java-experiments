/*
AIM:Design a Multithreaded Bank Transaction System in Java
NAME:Abdul Rehman Choudhry
UIN:231P099
ROLL NO:05
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
// BankAccount class that handles deposits and withdrawals
class BankAccount {
private int balance;
// Constructor to initialize the balance
public BankAccount(int initialBalance) {
this.balance = initialBalance;
}
// Synchronized method to deposit money
public synchronized void deposit(int amount) {
balance += amount;
System.out.println(Thread.currentThread().getName() + " deposited " + amount + ".
New balance: " + balance);
}
// Synchronized method to withdraw money
public synchronized void withdraw(int amount) {
if (balance >= amount) {
balance -= amount;
System.out.println(Thread.currentThread().getName() + " withdrew " +
amount + ". New balance: " + balance);
} else {
System.out.println(Thread.currentThread().getName() + " tried to withdraw "
+ amount + " but insufficient balance.");
}
}
// Method to get the current balance
public int getBalance() {
return balance;
}
}
// A runnable task for depositing money
class DepositTask implements Runnable {
private BankAccount account;
private int amount;
// Constructor to initialize the bank account and deposit amount
public DepositTask(BankAccount account, int amount) {
this.account = account;
this.amount = amount;
}
@Override
public void run() {
account.deposit(amount);
}
}
// A runnable task for withdrawing money
class WithdrawTask implements Runnable {
private BankAccount account;
private int amount;
// Constructor to initialize the bank account and withdrawal amount
public WithdrawTask(BankAccount account, int amount) {
this.account = account;
this.amount = amount;
}
@Override
public void run() {
account.withdraw(amount);
}
}
// Main class to demonstrate the multithreading bank transaction system
public class MultithreadingBankDemo {
public static void main(String[] args) {
// Create a shared bank account with an initial balance of 1000
BankAccount account = new BankAccount(1000);
/*
AIM:Create a Simple Calculator GUI in Java using Swing
// Create threads for depositing and withdrawing money
Thread depositThread1 = new Thread(new DepositTask(account, 500), "Thread-1");
Thread depositThread2 = new Thread(new DepositTask(account, 300), "Thread-2");
Thread withdrawThread1 = new Thread(new WithdrawTask(account, 400), "Thread3");
Thread withdrawThread2 = new Thread(new WithdrawTask(account, 800), "Thread4");
// Start all threads
depositThread1.start();
depositThread2.start();
withdrawThread1.start();
withdrawThread2.start();
// Ensure all threads complete before showing the final balance
try {
depositThread1.join();
depositThread2.join();
withdrawThread1.join();
withdrawThread2.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
// Display the final balance after all transactions
System.out.println("Final balance: " + account.getBalance());
}
}