package part5.removingRepetitiveCode;

public class counterProgram {
  public static void main(String[] args) {

    Counter counter = new Counter();
    Counter startValuedCounter = new Counter(15);


    for(int i=0; i<10; i++) {
      counter.decrease(10);
    }

    System.out.println(counter.value());
    System.out.println(startValuedCounter.value());
  }
}
