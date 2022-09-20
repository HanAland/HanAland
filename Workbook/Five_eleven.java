package Workbook;

import java.util.Scanner;
public class Five_eleven {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("\nLet's play Rolling Java. Type anything to start.\n");
    System.out.println("Great, here are the rules:\n");
    System.out.println("\t- If you roll a 6 the game stops.");
    System.out.println("\t- If you roll a 4 nothing happens.");
    System.out.println("\t- Otherwise, you get 1 point.\n");
    System.out.println("You must collect at least 3 points to win. Enter anything to roll:\n");

    int diceRoll = rollDice();
    int point = 0;

    while(diceRoll != 6)
    {
      diceRoll = rollDice();
      System.out.print("You rolled a " + diceRoll + ". ");
  
      if(diceRoll != 4 && diceRoll != 6)
      {
        System.out.println("One point. Keep rolling.\n");
        point++;
      }
      else if(diceRoll == 6)
      {
        System.out.println("End of the game.\n");
        if(point >= 3)
        {
          System.out.println("-----------------------------");
          System.out.println("Your total point is: " + point);
          System.out.println("\nWow, that's lucky. You win!\n");
        }
        else
        {
          System.out.println("-----------------------------");
          System.out.println("Your total point is: " + point);
          System.out.println("\nTough luck, you lose :(\n");
        }
        System.exit(0);
      }
      else
      {
        System.out.println("Zero points. Keep rolling.\n");  
      }

  
    }

    if(point >= 3)
    {
      System.out.println("Wow, that's lucky. You win!\n");
    }
    else
    {
      System.out.println("Tough luck, you lose :(\n");
    }
    
  }
  
  public static int rollDice()
  {
    double randomNum = Math.random() * 6;
    randomNum += 1;
    return (int)randomNum;
  }
}