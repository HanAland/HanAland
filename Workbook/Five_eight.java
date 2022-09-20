package Workbook;

import java.util.Scanner;
public class Five_eight {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int secretNum = 3;
    System.out.print("\nI chose a number between 1 and 5. Try to guess it: ");
    int guess = input.nextInt();

    while(guess != secretNum)
    {
      System.out.print("Guess again: ");
      guess = input.nextInt();
      if(guess > 5)
      {
      System.out.println("\nError. You must enter a number between 1 and 5.\n");
      }
    }
    if(guess == secretNum)
    {
      System.out.println("\nCongrats! You've found a secret number!");
    }
    
  }
}
