package part5.objectsAndReferences;

public class Apartment {

  private int rooms;
  private int square;
  private int pricePerSquare;

  public Apartment(int rooms, int squares, int pricePerSquare) {
    this.rooms = rooms;
    this.square = squares;
    this.pricePerSquare = pricePerSquare;
  }

  public boolean largerThan(Apartment compared) {
    if(this.square>compared.square) {
      return true;
    }
    return false;
  }

  public int priceDifference(Apartment compared) {
    int housePrice = this.square*this.pricePerSquare;
    int comparedHousePrice=compared.pricePerSquare* compared.square;

    if(housePrice>comparedHousePrice) {
      return housePrice-comparedHousePrice;
    }
    return comparedHousePrice-housePrice;
  }

  public boolean moreExpensiveThan(Apartment compared) {
    int housePrice = this.square*this.pricePerSquare;
    int comparedHousePrice=compared.pricePerSquare* compared.square;

    if(housePrice>comparedHousePrice) {
      return true;
    }
    return false;
  }
}
