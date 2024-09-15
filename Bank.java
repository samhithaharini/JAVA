import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the amount you wish to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Error: Insufficient funds.");
        } else {
            
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Your balance is: " + balance);
        }

        scanner.close();
    }
}