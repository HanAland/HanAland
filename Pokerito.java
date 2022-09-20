import java.util.Scanner;
public class Pokerito {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int count = 1;
    int foundPlayer = 0;
    int foundComputer = 0;
    int usr;
    int computer;
 
    System.out.println("\nLet's play Pokerito. Type anything when you're ready.");
    System.out.println("It's like Poker, but a lot simpler.\n");
    System.out.println("\t- There are two players, you and the computer.");
    System.out.println("\t- The dealer will give each player one card.");
    System.out.println("\t- Then, the dealer will draw five cards (the river)");
    System.out.println("\t- The player with the most river matches wins!");
    System.out.println("\t- If the matches are equal, everyone's a winner!\n");

    System.out.println("Ready? Type yes if you are.");
    String userinput = input.nextLine();
    if(userinput.equalsIgnoreCase("Yes"))
    {
      System.out.println("\n---------------------------------------------------------------\n");
      System.out.println("\nHere's your card:");

      usr = (int)randomCard();
      
      System.out.println("\nHere's the computer's card:");


      computer = (int)randomCard();

      System.out.println("\n--------------------------------------------------------- -----\n");

      System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
      input.nextLine();
      for(int i = 0; i < 5; i++)
      {  
        System.out.println("Card " + count);
        
        double ran = randomCard();
        count++;
            
        input.nextLine();

        if((int)ran == usr)
        {
          foundPlayer++;
        }
        else if((int)ran == computer)
        {
          foundComputer++;
        }
      }
      
      System.out.println("Your number of matches: " + foundPlayer);
      System.out.println("Computer number of matches: " + foundComputer);

      if(foundPlayer > foundComputer)
      {
        System.out.println("You win!");
        System.exit(0);
      }
      else if (foundComputer > foundPlayer)
      {
        System.out.println("Computer wins!");
        System.exit(0);
      }
      else 
      {
        System.out.println("You tie!");
        System.exit(0);
      }
    
    }
    
  }
  
  public static double randomCard()
  {
    double randNum = 1 + Math.random() * 13;
    switch((int)randNum)
    {
      case 1: 
        System.out.println(" _______ ");
        System.out.println("| 1     |");
        System.out.println("|       |");
        System.out.println("|   0   |");
        System.out.println("|       |");
        System.out.println("|______1|");
        break;
      case 2:
        System.out.println(" _______ ");
        System.out.println("| 2     |");
        System.out.println("|   0   |");
        System.out.println("|       |");
        System.out.println("|   0   |");
        System.out.println("|______2|");
        break;
      case 3:
        System.out.println(" _______ ");
        System.out.println("| 3     |");
        System.out.println("|  0 0  |");
        System.out.println("|       |");
        System.out.println("|   0   |");
        System.out.println("|______3|");
        break;
      case 4:
        System.out.println(" _______ ");
        System.out.println("| 4     |");
        System.out.println("|  0 0  |");
        System.out.println("|       |");
        System.out.println("|  0 0  |");
        System.out.println("|______4|");
        break;
      case 5: 
        System.out.println(" _______ ");
        System.out.println("| 5     |");
        System.out.println("|  0 0  |");
        System.out.println("|   0   |");
        System.out.println("|  0 0  |");
        System.out.println("|______5|");
        break;
      case 6:
        System.out.println(" _______ ");
        System.out.println("| 6     |");
        System.out.println("|  000  |");
        System.out.println("|  000  |");
        System.out.println("|  000  |");
        System.out.println("|______6|");
        break;
      case 7:
        System.out.println(" _______ ");
        System.out.println("| 7     |");
        System.out.println("|  0 0  |");
        System.out.println("| 0 0 0 |");
        System.out.println("|  0 0  |");
        System.out.println("|______7|");
        break;
      case 8:
        System.out.println(" _______ ");
        System.out.println("| 8     |");
        System.out.println("| 0 0 0 |");
        System.out.println("|  0 0  |");
        System.out.println("| 0 0 0 |");
        System.out.println("|______8|");
        break;
      case 9:
        System.out.println(" _______ ");
        System.out.println("| 9     |");
        System.out.println("| 0 0 0 |");
        System.out.println("| 0 0 0 |");
        System.out.println("| 0 0 0 |");
        System.out.println("|______9|");
        break;
      case 10:
        System.out.println(" _______ ");
        System.out.println("|10     |");
        System.out.println("| 00000 |");
        System.out.println("|       |");
        System.out.println("| 00000 |");
        System.out.println("|_____10|");
        break;
      case 11:
        System.out.println(" _______ ");
        System.out.println("|11     |");
        System.out.println("| 00000 |");
        System.out.println("|   0   |");
        System.out.println("| 00000 |");
        System.out.println("|_____11|");
        break;
      case 12:
        System.out.println(" _______ ");
        System.out.println("|12     |");
        System.out.println("| 00000 |");
        System.out.println("|  0 0  |");
        System.out.println("| 00000 |");
        System.out.println("|_____12|");
        break;
      case 13: 
        System.out.println(" _______ ");
        System.out.println("|13     |");
        System.out.println("| 00000 |");
        System.out.println("|  000  |");
        System.out.println("| 00000 |");
        System.out.println("|_____12|");
        
        break;
    }
    return randNum;
    
  }
}