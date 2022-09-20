package Workbook;

public class Six_seven {
    public static void main(String[] args) {
      
  
      String[] record = {"wins", "wins", "losses", "losses", "wins", "losses","losses","wins", "losses"};
      int winCount = 0;
      int loseCount = 0;
      for(int i = 0; i < record.length; i++)
      {
        if(record[i] == "wins")
        {
          winCount++;
        }
        else
        {
          loseCount++;
        }
        
        
      }
  
      System.out.println("With a professional record of " + winCount + " wins and " + loseCount + " losses.");
      System.out.println("He is the pride of oracle: Java Fury!");
  
      
    }
  }