package Workbook;

import java.util.Scanner;
public class Six_four {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Java Grocers.");
System.out.println("What can I help you find?\n");
    String userinput = input.nextLine();
    System.out.println();
    String[] grocers = {"yam", "water", "icecream"};
    int count = 0;
    for(int i = 0; i < grocers.length; i++)
    {
          if(!userinput.equalsIgnoreCase(grocers[i]))
      {
        count++;
      }
      else
      {
        System.out.println("We have that in aisle: " + count);
      }
    }

    
  }
}
