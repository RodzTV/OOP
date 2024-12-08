import java.util.Scanner;

public class CreditCardTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of credit cards: ");
        int numCards = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        CreditCard[] cards = new CreditCard[numCards];
        
        // Input credit card details
        for (int i = 0; i < numCards; i++) {
            System.out.println("\nCard " + (i + 1) + ":");
            System.out.print("Customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Bank name: ");
            String bankName = scanner.nextLine();
            System.out.print("Account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Credit limit: ");
            double creditLimit = scanner.nextDouble();
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            
            cards[i] = new CreditCard(customerName, bankName, accountNumber, creditLimit, balance);
        }
        // Display and perform operations on the credit cards
        for (CreditCard card : cards) {
            card.displayCardInfo();
            card.charge(100); // Simulate a charge of 100
            System.out.println("New balance = " + card.getBalance());
            card.payment(200); // Simulate a payment of 200
            System.out.println("New balance = " + card.getBalance());
            card.payment(100); // Another payment of 100
            System.out.println("New balance = " + card.getBalance());
        }
        scanner.close();
    }
}