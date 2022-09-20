package Workbook;

import java.util.Arrays;

public class Six_six {
  public static void main(String[] args) {

    int[] tenRanNum = new int[10];
    int[] highScore = new int[tenRanNum.length];
    int count = 0;

    for (int i = 0; i < tenRanNum.length; i++) {
      tenRanNum[i] = randomNumber();
      highScore[i] = tenRanNum[i];

    }
    System.out.println("\nHere are the scores: " + Arrays.toString(tenRanNum));

    Arrays.sort(tenRanNum);
    int res = tenRanNum[tenRanNum.length - 1];
    int[] wha = new int[1];
    wha[0] = res;

    System.out.println("\nThe highest score is: " + res + ". Impressive!");

    for (int i = 0; i < highScore.length; i++) {
      if (!(highScore[i] == wha[0])) {
        count++;
      } else {
        System.out.println("It's the gentleman in seat: " + count + ". Give that man a cookie!");
      }
    }

  }

  public static int randomNumber() {
    double ranNum = Math.random() * 50000;
    return (int) ranNum;
  }
}