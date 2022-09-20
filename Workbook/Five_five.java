package Workbook;

import java.util.Scanner;
public class Five_five {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("\nI hear you like to count by threes");
    System.out.println("\nJimmy: It depends.");
    System.out.println("Oh,ok...");
    System.out.print("\n1. Pick a number to count by ");
    int inputOne = input.nextInt();
    System.out.print("\n2. Pick a number to start counting from ");
    int inputTwo = input.nextInt();
    System.out.print("\n3. Pick a number to count to ");
    int inputThree = input.nextInt();

    System.out.println("\n---------------------------------------------------\n");

    for(int i = inputTwo; i <= inputThree; i += inputOne)
    {
      System.out.print(i + " ");    
    }
    
  }
}