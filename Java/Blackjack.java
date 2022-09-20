import java.util.Scanner;
public class Blackjack 
{
  
  static int convertCard = 0;
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args) 
  {
    
    System.out.println("---------------------------------------------------");
    System.out.println("Welcome to Java Casino!");
    System.out.println("Do you have a knack for BlackJack?");
    System.out.println("We shall see...");
    System.out.println("...Ready? Press anything to begin!");

    String anything = input.nextLine();
    System.out.println();
    
    System.out.println("You get a ");
    int userGet1 = drawRandomCard(convertCard);
    System.out.println("\nand a ");
    int userGet2 = drawRandomCard(convertCard);

    int userTotal = userGet1 + userGet2;
    System.out.println("\nYour total is: " + userTotal + "\n");

    System.out.println("\nThe dealer shows:");
    int dealerGet1 = drawRandomCard(convertCard);
    
    System.out.println("\nand has a card facing down");
    System.out.println(" _______ ");
    System.out.println("|       |");
    System.out.println("|   J   |");
    System.out.println("|  JJJ  |");
    System.out.println("|   J   |");
    System.out.println("|_______|");
    
    System.out.println("\nThe dealer's total is hidden\n");

    String ans = hitOrStay();

    if(ans.equals("hit"))
    {
      int newDraw = drawRandomCard(convertCard);
      userTotal += newDraw;
      System.out.println("\nYour new total is: " + userTotal);
      if(userTotal > 21)
      {
        System.out.println("Bust! Player loses");
        System.exit(0);
      }
      
    }
    else if(ans.equals("stay"))
    {
      System.out.println("\nDealer's turn\n");

      System.out.println("Dealer's cards are");
      // System.out.println(dealerGet1);
      drawRandomCard(dealerGet1);
      int dealerGet2 = drawRandomCard(convertCard);
      int dealerTotal = dealerGet1 + dealerGet2;
      System.out.println("\nDealer's total is: " + dealerTotal);
    }
    
  }
  
  public static int drawRandomCard(int convertCard)
  {
    int card= 0;
    if(convertCard == 0)
    {
      card = (int)(1 + Math.random() * 10);
      convertCard = card;
    }
    else
    {
       card = convertCard;
    }
    
    switch(convertCard)
    {
      case 1: 
        System.out.println(" _______ ");
        System.out.println("| A _   |");
        System.out.println("|  ( )  |");
        System.out.println("| (_'_) |");
        System.out.println("|   |   |");
        System.out.println("|______V|");
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
        System.out.println("| Q   ww|");
        System.out.println("|   o {(|");
        System.out.println("|  o o%%|");
        System.out.println("|   |%%%|");
        System.out.println("|___%%%0|");
        break;
      
    }
    return convertCard;
  }
  
  public static String hitOrStay()
  {
    System.out.println("Would you like to hit or stay?");
    String userAns = input.nextLine();

    // Every time the player hits, draw a new card and calculate their new total. Then, print:
    while(!(userAns.equals("hit") || userAns.equals("stay")))
    {
      System.out.println("Please write 'hit' or 'stay'");
      userAns = input.nextLine();
      if(userAns.equals("stay"))
      {
        
      }
    }
    return userAns;

  }
  
}