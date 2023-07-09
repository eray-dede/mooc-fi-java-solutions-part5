package part5.objectsAndReferences;

public class PaymentCard {

  private double balance;

  public PaymentCard(double balance) {
    this.balance = balance;
  }

  public double balance() {
    return this.balance;
  }

  public void addMoney(double increase) {
    this.balance = this.balance + increase;
  }

  public boolean takeMoney(double amount) {
    if(this.balance-amount<0) {
      return false;
    }
    this.balance=this.balance-amount;
    return true;
  }
}
