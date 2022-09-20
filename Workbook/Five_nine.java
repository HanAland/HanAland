package Workbook;

import java.util.Scanner;

public class Five_nine {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String username = "Hello";
    String password = "Howdy";
    System.out.println("\nWelcome to Javagram! Sign in below\n\n");
    System.out.print("· Username: ");
    String userInput1 = input.nextLine();
    System.out.print("· Password: ");
    String userInput2 = input.nextLine();

    while(username != userInput1 && password != userInput2)
    {
        System.out.println("\nIncorrect! Please try again.\n");
        System.out.print("· Username: ");
        userInput1 = input.nextLine();
        System.out.print("· Password: ");
        userInput2 = input.nextLine();
        if(userInput1.equalsIgnoreCase(username) && userInput2.equalsIgnoreCase(password))
        {
          System.out.println("\nSign in successfully. Welcome!");
          System.exit(0);
        }
    }
    
  }
}