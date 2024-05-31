import java.util.*;
public class Task_2 {
        static double balance = 0;
        static String name = "";
        static int accountNumber = 0;
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int option = 0;
    
            while (true) {
                System.out.println("Welcome to the Bank of Java");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Display Account Details");
                System.out.println("5. Exit");
                System.out.print("Enter an option: ");
                option = sc.nextInt();
    
                switch (option) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        displayAccountDetails();
                        break;
                    case 5:
                        System.out.println("Thank you for banking with us. Have a great day!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                        break;
                }
            }
        }
    
        public static void createAccount() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.print("Enter your account number: ");
            accountNumber = sc.nextInt();
            System.out.print("Deposit some anount as your initial balance: ");
            balance = sc.nextDouble();
    
            System.out.println("Account created successfully!");
        }
    
        public static void deposit() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount to deposit: ");
            double amount = sc.nextDouble();
    
            balance += amount;
            System.out.println("$" + amount + " has been deposited to your account.");
            System.out.println("Your current balance is $" + balance);
        }
    
        public static void withdraw() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: ");
            double amount = sc.nextDouble();
    
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println("$" + amount + " has been withdrawn from your account.");
                System.out.println("Your current balance is $" + balance);
            }
        }
    
        public static void displayAccountDetails() {
            System.out.println("Account Details:");
            System.out.println("Name: " + name);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }
