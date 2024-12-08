public class CreditCard {
  private String customerName;
  private String bankName;
  private String accountNumber;
  private double creditLimit;
  private double balance;

  // Constructor
  public CreditCard(String customerName, String bankName, String accountNumber, double creditLimit, double balance) {
      this.customerName = customerName;
      this.bankName = bankName;
      this.accountNumber = accountNumber;
      this.creditLimit = creditLimit;
      this.balance = balance;
  }

  // Getter and Setter methods
  public String getCustomerName() {
      return customerName;
  }

  public String getBankName() {
      return bankName;
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public double getCreditLimit() {
      return creditLimit;
  }

  public double getBalance() {
      return balance;
  }

  public void charge(double amount) {
      if (balance + amount <= creditLimit) {
          balance += amount;
      } else {
          System.out.println("Charge exceeds credit limit!");
      }
  }

  public void payment(double amount) {
      if (balance - amount >= 0) {
          balance -= amount;
      } else {
          System.out.println("Payment exceeds balance!");
      }
  }

  // Display Card Info
  public void displayCardInfo() {
      System.out.println("Customer = " + customerName);
      System.out.println("Bank = " + bankName);
      System.out.println("Account = " + accountNumber);
      System.out.println("Balance = " + balance);
      System.out.println("Limit = " + creditLimit);
  }
}
