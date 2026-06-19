import java.util.Scanner;

// BankAccount Class
class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount! Deposit failed.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Withdrawal failed.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Balance Check Method
    public void checkBalance() {
        System.out.println("Available Balance: ₹" + balance);
    }
}

// ATM Class
public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial Balance
        BankAccount account = new BankAccount(10000);

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println(" ATM MENU");
            System.out.println("==============================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}

