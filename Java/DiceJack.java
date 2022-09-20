import java.util.Scanner;
public class DiceJack {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println("\nWelcome to Dice Jack game!\n");
    System.out.println("This is the game rules: ");
    System.out.println("The user pick three numbers and roll the dice three times. If the sum of dice rolls is smaller than the sum of numbers you chose and the difference between the two numbers is less than three, you win. Otherwise, you lose. \n");
    
    
    System.out.println("Enter three numbers between 1 and 6");

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    if(num1 < 1 || num2 < 1 || num3 < 1)
    {
      System.out.println("Numbers cannot be less than 1. Shutting game down");
      System.exit(0);
    }
    if(num1 > 6 || num2 > 6 ||num3 > 6)
    {
      System.out.println("Numbers cannot be greater than 6. Shutting game down");
      System.exit(0);
    }

    int sumOfNum = num1 + num2 + num3;
    int sumofDice = roll1 + roll2 + roll3;

    System.out.println("\n-------------------------------\n");
    System.out.println("User picked: " + num1 + ", " + num2 + ", " + num3);
    System.out.println("Random dice numbers are: " + roll1 + ", " + roll2 + ", " + roll3);
    System.out.println("\nDice sum = " + sumofDice + ". Number sum = " + sumOfNum + ".\n");
    System.out.println("-------------------------------\n");
    checkWin(sumofDice, sumOfNum);
    System.out.println();

  }
  public static int rollDice()
  {
    double ranNum = Math.random() * 6;
    ranNum += 1;
    return (int)ranNum;
  }
  public static void checkWin(int sumOfDice, int sumOfNum)
  {
    if(sumOfNum > sumOfDice && sumOfNum - sumOfDice < 3)
    {
      System.out.println("Congrats, You win!");
    }
    else
    {
      System.out.println("Sorry, You lose!");
    }
  }
}