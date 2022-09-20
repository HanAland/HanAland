package Workbook;

import java.util.Arrays;

public class Six_five {
  public static void main(String[] args) {
    int[] tenRanNum = new int[10];
    for (int i = 0; i < tenRanNum.length; i++) {
      tenRanNum[i] = randomNumber();

    }

    System.out.println("\nHere are the scores: " + Arrays.toString(tenRanNum));

    Arrays.sort(tenRanNum);
    int res = tenRanNum[tenRanNum.length - 1];

    System.out.println("\nThe highest score is: " + res + ". Give that man a cookie!");
  }

  public static int randomNumber() {
    double ranNum = Math.random() * 50000;
    return (int) ranNum;
  }
}