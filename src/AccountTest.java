import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for initial account balance
        System.out.println("Enter the account balance: ");
        double initialBalance = scanner.nextDouble();

        // Prompt user for the amount to credit
        System.out.println("Enter the amount to credit: ");
        double creditAmount = scanner.nextDouble();

        // Prompt user for the amount to debit
        System.out.println("Enter the amount to debit: ");
        double debitAmount = scanner.nextDouble();

        // Creating an Account object with an initial value
        Account account = new Account(initialBalance);

        // Display the initial balance
        System.out.println("Initial balance: " + account.getBalance());

        // Test credit method
        account.credit(creditAmount);
        System.out.println("After crediting: " + account.getBalance());

        // Test debit method
        account.debit(debitAmount);
        System.out.println("After debiting: " + account.getBalance());

        scanner.close();
    }
}