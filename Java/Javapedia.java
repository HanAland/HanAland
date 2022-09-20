import java.util.Arrays;
import java.util.Scanner;

public class Javapedia 
{
    public static void main(String[] args)
    {
        System.out.println("**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        Scanner input = new Scanner(System.in);
        int numHisFig = input.nextInt();

        System.out.println("\n");

        String name, dob, job;
        String[] info = new String[3];
        
        String[][] database = new String[numHisFig][info.length];

        int fig = 1;
        
        
        for(int i = 0; i < numHisFig; i++)
        {
            System.out.println("Figure " + fig);
            fig++;
            
            System.out.print("\t• Name: ");
            name = input.next();
            System.out.print("\t• Date of birth: ");
            dob = input.next();
            System.out.print("\t• Occupation: ");
            job = input.next();

            info[i] = name + dob + job;
            
        }
        
        System.out.println(database);
        


    }
    public static void print2DArray(String[][] array)
    {
        System.out.println("These are the values you stored:");

        for(String[] i: array)
        {
            for(String j: i)
            {
                System.out.print("\t" + j + " ");
            }
        }
        System.out.println();
    }
}
