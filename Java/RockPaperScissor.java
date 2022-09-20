import java.util.Scanner;
public class RockPaperScissor {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("When I say 'Shoot', Choose: rock, paper, or scissors.");
    System.out.println();
    System.out.println("Are you ready? Write 'yes' if you are.");
    String ready = input.nextLine();
    String computer = "scissors";
    String pick;
    String rock = "rock";
    String paper = "paper";
    
    
    if(ready.equalsIgnoreCase("yes"))
    {
      System.out.println();
      System.out.println("Great! \n rock - paper - scissors, shoot!");
      
      pick = input.nextLine();
      System.out.println();
      System.out.println("You choose: " + pick);
      System.out.println("The computer choose: " + computer);
      if(pick.equalsIgnoreCase(computer))
      {
        System.out.println("You tie!");
      }
      else if(pick.equalsIgnoreCase(rock))
      {
        System.out.println("You win!");
      }
      else if(pick.equalsIgnoreCase(paper))
      {
        System.out.println("You lose!");
      }
      else
      {
        System.out.println("\nError. Please pick amongst rock, paper or scissors.");
      }
    }
    else
    {
      System.err.println("\nError. Please enter 'yes' to play rock paper scissors");
    }
    
  }
}