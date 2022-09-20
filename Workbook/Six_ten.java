package Workbook;

import java.util.Scanner;

public class Six_ten {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many pizza toppings do you want?");
    int[] countTopping = new int[input.nextInt()];
    String[] topping = new String[countTopping.length];
    System.out.println("Great, enter each topping!");

    for (int i = 0; i < countTopping.length; i++) {
      System.out.print(i + ". ");
      topping[i] = input.nextLine();
      System.out.println();

    }
    if (countTopping.length == topping.length) {
      System.out.println("Thank you! Here are the toppings you ordered");
      for (int i = 0; i < topping.length; i++) {
        System.out.print(i + ". " + topping[i]);

      }

    }

  }
}