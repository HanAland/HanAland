import java.util.Arrays;
import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
      int count = 0;
      int revCount = 0;

      System.out.println("Enter size of the array: ");
      int size = input.nextInt(); 
      int[] array = new int[size];

      while(size > 0)
      {
        for(int i = 0; i < array.length; i++)
        {
          System.out.println("Ente number " + i + ": ");
          int userinput = input.nextInt();
          array[i] = userinput;
          count++;
       
          if(count == array.length)
          {   
            for ( int j = array.length - 1; j >= 0; j-- )
            {
              revCount++;
              if(revCount == count)
              {
                if(array[j] == array[i])
                {
                  System.out.println(Arrays.toString(array) + " is a palindrome.");
                
                }
                else
                {
                  System.out.println(Arrays.toString(array)+" isn't a palindrome.");
                }
              }
            }
          }
        }
        System.out.println("Enter size of the array: ");
        size = input.nextInt(); 
        array = new int[size];
      }
      System.out.println("The program is terminating.");
  }
}