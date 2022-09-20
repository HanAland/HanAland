package Workbook;

import java.util.Scanner;
public class Five_two {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("\nHi Bart, I can write lines for you.");
    System.out.println("What do you want me to write?\n");

    String cheatBot = input.nextLine();
    System.out.println("\n");
    

    for(int i = 1; i < 100; i++)
    {
      System.out.print(i + ". ");
      System.out.println(cheatBot);
    }
  }
}