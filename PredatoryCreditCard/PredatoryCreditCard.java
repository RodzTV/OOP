public class CreditCard {
  private String customer;
  private String bank;
  private String account;
  private double balance;
  private int creditLimit;

  public CreditCard(String cust, String bk, String acnt, int lim, double initialBalance) {
      customer = cust;
      bank = bk;
      account = acnt;
      creditLimit = lim;
      balance = initialBalance;
  }

  public String getCustomer() {
      return customer;
  }

  public String getBank() {
      return bank;
  }

  public String getAccount() {
      return account;
  }

  public double getBalance() {
      return balance;
  }

  public int getCreditLimit() {
      return creditLimit;
  }

  public void makePayment(double amount) {
      balance -= amount;
  }

  public boolean charge(double price) {
      if (price + balance > creditLimit) {
          System.out.println("Charge exceeds credit limit");
          return false;
      }
      balance += price;
      return true;
  }
}

// Subclass PredatoryCreditCard that assesses interest and fees
public class PredatoryCreditCard extends CreditCard {
  private double apr; // Annual Percentage Rate

  public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBalance, double rate) {
      super(cust, bk, acnt, lim, initialBalance);
      apr = rate;
  }

  public void processMonth() {
      // Calculate monthly interest based on APR
      if (getBalance() > 0) {
          double monthlyInterest = (apr / 100.0) / 12 * getBalance();
          System.out.printf("Interest added: %.2f\n", monthlyInterest);
          charge(monthlyInterest); // Adds interest as a charge to the balance
      }
  }
}
