package Workbook;

public class Six_eight {
    public static void main(String[] args) {
      String[] kindApple = { "Gala", "Granny Smith", "Macintosh" };
      double[] priceApple = { 1.99, 1.49, 1.29 };
  
      int count = 0;
  
      System.out.println("\nHere's your receipt\n");
  
      for (int i = 0; i < kindApple.length; i++) {
        for (int j = 0; j < priceApple.length; j++) {
          if (i == j) {
            System.out.println("\t" + kindApple[i] + ": $" + priceApple[i]);
          } else {
            count++;
          }
  
        }
  
      }
    }
}
