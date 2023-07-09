package part5.learnObjectOrientedProgramming;

public class Timer {

  private ClockHand seconds;
  private ClockHand hundredthsOfASeconds;

  public Timer() {
    this.seconds= new ClockHand(60);
    this.hundredthsOfASeconds = new ClockHand(100);
  }

  public void advance() {
    this.hundredthsOfASeconds.advance();

    if(this.hundredthsOfASeconds.value()==0) {
      this.seconds.advance();
    }
  }

  public String toString() {
    return seconds + ":" + hundredthsOfASeconds;
  }
}
