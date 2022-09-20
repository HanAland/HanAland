package Workbook;

import java.util.Scanner;
public class Six_three{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
    int count = 1;
    System.out.print("Do you sell ");
    String userinput = input.nextLine();
    
    for(int i = 0; i < aisle.length; i++){
      if(!userinput.equalsIgnoreCase(aisle[i]))
      {
        count++;
      }
      else
      {
        System.out.println("We have that in aisle: " + count);
      }
      
      
    } 
  }
}