package collections.streams.listToMapToSingleMap;

import java.util.Random;

public class Utils {
  private static int min = 1;
  private static int max = 10;

  public static int getRandomNumber() {
    Random rand = new Random();
    return rand.nextInt((max - min) + 1) + min;
  }
}
