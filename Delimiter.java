import java.util.Scanner;
public class Delimiter{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter two integers (on the same line)");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    System.out.println("Enter two very big integers (on the same line)");
    long bigNum1 = input.nextLong();
    long bigNum2 = input.nextLong();

    System.out.println("Enter two decimals (on the same line)");
    double decimal1 = input.nextDouble();
    double decimal2 = input.nextDouble();

    System.out.println("Enter two text values (on the same line)");
    String text1 = input.next();
    String text2 = input.next();  //scan.next() will skip all the white space and read only the text

    System.out.println("Enter another two text values (on the same line)");
    String text3 = input.nextLine();
    String text4 = input.nextLine();  //scan.nextLine() reads 
    
    input.close();

    System.out.println("\tIntegers: " + num1 + " " + num2);
    System.out.println("\tBig Integers: " + bigNum1 + " " + bigNum2);
    System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
    System.out.println("\tTexts: " + text1 + " " + text2);
    System.out.println("\tTexts: " + text3 + " " + text4);

    
  }
}