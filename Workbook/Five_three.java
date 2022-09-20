package Workbook;

import java.util.Scanner;
public class Five_three {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\nHi Timmy! Choose a number to count to: ");
    int timmysInput = input.nextInt();
    int count = 0;
    
    System.out.println("\nGreat! This is how it's done");
    while(timmysInput != count)
    {
      System.out.print(count + " ");
      count++;
    }
    System.out.print(timmysInput);
  }
}