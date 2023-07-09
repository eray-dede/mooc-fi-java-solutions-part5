package part5.objectsAndReferences;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
      this.money=1000;
    }

    public double eatAffordably(double payment) {
      if(payment<2.5) {
        return payment;
      }
      this.money=this.money+2.5;
      payment=payment-2.5;
      affordableMeals++;
      return payment;
    }

    public double eatHeartily(double payment) {
      if(payment<4.3) {
        return payment;
      }
      this.money=this.money+4.3;
      payment=payment-4.3;
      heartyMeals++;
      return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
      if(card.takeMoney(2.5)==true) {
        this.money=this.money+2.5;
        affordableMeals++;
        return true;
      }
      return false;
    }

    public boolean eatHeartily(PaymentCard card) {
      if(card.takeMoney(4.3)==true) {
        this.money=this.money+4.3;
        heartyMeals++;
        return true;
      }
      return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
      if(sum>=0) {
        this.money=this.money+sum;
        card.addMoney(sum);
      }
    }


    public String toString() {
      return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
