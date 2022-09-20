package Workbook;

public class Five_ten{
    public static void main(String[] args) {
      int dice1 = rollDice();
      int dice2 = rollDice();
      System.out.println("Dice 1: " + dice1);
      System.out.println("Dice 2: " + dice2 + "\n");
  
      
      while(dice1 != dice2)
      {
        dice1 = rollDice();
        dice2 = rollDice();
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");
  
        if(dice1 == dice2)
        {
          System.out.println("\nYou rolled doubles!\n");
          
        }
        
      }
    }
    public static int rollDice()
    {
      double randomNum = Math.random() * 6;
      randomNum += 1;
      return (int)randomNum;
    }
  }