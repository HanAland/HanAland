import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("1. Which country held the 2016 Summer Olympics?");
    System.out.println("\t a) China \n\t b) Ireland \n\t c) Brazil \n\t d) Italy");
    String answer = "cadab";
    String answerOne = input.nextLine();
    int score = 0;
    
    if(answer.charAt(0) == answerOne.charAt(0))
    {
      System.out.println("\nYou are correct");
      score += 5;
    }
    else
    {
      System.out.println("\nWrong");
    }

    System.out.println();
    
    System.out.println("2. Which planet is the hottest?");
    System.out.println("\t a) Venus \n\t b) Saturn \n\t c) Mercury \n\t d) Mars");
    String answerTwo = input.next();
    
    if(answer.charAt(1) == answerTwo.charAt(0))
    {
      System.out.println("\nYou are correct");
      score += 5;
    }
    else
    {
      System.out.println("\nWrong");
    }
    
    System.out.println();
    
    System.out.println("3. What is the rarest blood type?");
    System.out.println("\t a) O \n\t b) A \n\t c) B \n\t d) AB-Negative");
    String answerThree = input.next();
    
    if(answer.charAt(2) == answerThree.charAt(0))
    {
      System.out.println("You are correct");
      score += 5;
    }
    else
    {
      System.out.println("Wrong");
    }

    System.out.println();
    
    System.out.println("4. Which one of these characters is friends with Harry Potter?");
    System.out.println("\t a) Ron Weasley \n\t b) Hermione Granger \n\t c) Draco Malfoy");
    String answerFour = input.next();
    
    if((answer.charAt(3) == answerFour.charAt(0)) || (answer.charAt(4) == answerFour.charAt(0)))
    {
      System.out.println("You are correct");
      score += 5;
    }
    else
    {
      System.out.println("Wrong");
    }

    System.out.println("\n");

    System.out.println("Your final score is: " + score + "/20");

    if(score >= 15)
    {
      System.out.println("Wow, you know your stuff!");
    }
    else if((5 <= score) && (score < 15))
    {
      System.out.println("Not bad!");
    }
    else
    {
      System.out.println("better luck next time.");
    }

  }
}