package part5.learnObjectOrientedProgramming;

public class clockHandProgram {

  public static void main(String[] args) {

    Clock clock = new Clock();

    while(true) {
      System.out.println(clock);
      clock.advance();
    }
  }
}
