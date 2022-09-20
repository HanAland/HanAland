public class Tip {
    public static void main(String[] args) 
    {
      System.out.println("Waiter: I hope you enjoyed your meal! Your total today is $123.2");
      tipTheWaiter(123.2);
      
      
    }
    public static void tipTheWaiter(double bill)
    {
      double calcTip = bill * 0.15;
      System.out.println("\nThank you!\nYour service was wonderful! Please, accept this tip: $" + calcTip);
      
    }
  }