package completableFuture.MultipleAsynClientsToList;

import java.util.Random;

public class Utils {
  private static int min = 1;
  private static int max = 10;

  public static int getRandomNumber() {
    Random rand = new Random();
    return rand.nextInt((max - min) + 1) + min;
  }

  public static void delayExec() {
    try {
      Thread.sleep(getRandomNumber() * 1000);
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt();
    }
  }
}
