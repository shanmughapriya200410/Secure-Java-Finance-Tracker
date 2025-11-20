import java.util.ArrayList;
import java.util.Scanner;

// Base class for Transactions
class Transaction {
    protected int id;
    protected String category;
    protected double amount;

    public Transaction(int id, String category, double amount) {
        this.id = id;
        this.category = category;
        this.amount = amount;
    }

    public String toString() {
        return String.format("ID: %d, Category: %s, Amount: %.2f", id, category, amount);
    }
}

// Income class inherits Transaction
class Income extends Transaction {
    public Income(int id, String category, double amount) {
        super(id, category, amount);
    }

    @Override
    public String toString() {
        return "Income -> " + super.toString();
    }
}

// Expense class inherits Transaction
class Expense extends Transaction {
    public Expense(int id, String category, double amount) {
        super(id, category, amount);
    }

    @Override
    public String toString() {
        return "Expense -> " + super.toString();
    }
}

// User class for simple authentication
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

// Main app for finance tracker
public class FinanceTrackerApp {
    private static ArrayList<Transaction> transactions = new ArrayList<>();
    private static int transactionCounter = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Secure Java Finance Tracker (Basic)");

        // Simple user registration simulation
        System.out.print("Register - Enter username: ");
        String regUser = scanner.nextLine();
        System.out.print("Register - Enter password: ");
        String regPass = scanner.nextLine();

        User user = new User(regUser, regPass);

        // Login simulation
        System.out.println("Please login.");
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (user.authenticate(username, password)) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid credentials, try again.");
            }
        }

        // Main menu loop
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addTransaction("income");
                    break;
                case 2:
                    addTransaction("expense");
                    break;
                case 3:
                    viewTransactions();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    private static void addTransaction(String type) {
        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        Transaction t;
        if (type.equals("income")) {
            t = new Income(transactionCounter++, category, amount);
        } else {
            t = new Expense(transactionCounter++, category, amount);
        }
        transactions.add(t);
        System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + " added successfully.");
    }

    private static void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions to show.");
            return;
        }
        System.out.println("\nAll Transactions:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
