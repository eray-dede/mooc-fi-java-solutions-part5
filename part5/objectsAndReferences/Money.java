package part5.objectsAndReferences;

public class Money {

  private final int euros;
  private final int cents;

  public Money(int euros, int cents) {
    if(cents>99) {
      euros = euros + cents/100;
      cents= cents %100;
    }

    this.euros=euros;
    this.cents=cents;
  }

  public int euros() {
    return euros;
  }

  public int cents() {
    return cents;
  }

  public String toString() {
    String zero = "";
    if (cents <= 10) {
      zero = "0";
    }

    return euros + "." + zero + cents + "e";
  }

  public Money plus(Money addition) {
    Money newMoney = new Money(this.euros+ addition.euros, this.cents + addition.cents);

    return newMoney;
  }

  public boolean lessThan(Money compared) {
    if(this.euros<compared.euros) {
      return true;
    }
    if(compared.euros==this.euros) {
      return this.euros<compared.euros;
    }

    return false;
  }
}

