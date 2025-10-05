import java.util.Scanner;

public class UserInterface {
    private static Account[] accounts = new Account[100];
    private static int accountCount = 0;
    private static int nextAccountNumber = 1001;
    private static Scanner sc = new Scanner(System.in);

    private static Account findAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }

    private static void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial deposit: ");
        double balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        Account newAcc = new Account(nextAccountNumber++, name, balance, email, phone);
        accounts[accountCount++] = newAcc;
        System.out.println("Account created successfully.");
        System.out.println("Your Account Number is: " + newAcc.getAccountNumber());
    }

    private static void performDeposit() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) acc.deposit(amt);
        else System.out.println("Account not found.");
    }

    private static void performWithdrawal() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) acc.withdraw(amt);
        else System.out.println("Account not found.");
    }

    private static void showAccountDetails() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) acc.displayAccountDetails();
        else System.out.println("Account not found.");
    }

    private static void updateContact() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            System.out.print("Enter new email: ");
            String email = sc.nextLine();
            System.out.print("Enter new phone: ");
            String phone = sc.nextLine();
            acc.updateContactDetails(email, phone);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("\n--- Banking Application ---");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> performDeposit();
                case 3 -> performWithdrawal();
                case 4 -> showAccountDetails();
                case 5 -> updateContact();
                case 6 -> {
                    System.out.println("Thank you for using the Banking Application.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
