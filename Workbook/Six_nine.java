package Workbook;

import java.util.Arrays;
public class Six_nine{
  public static void main(String[] args) {
    double[] afterTax = {1.99, 2.99, 3.99, 4.99};

    System.out.println("The original prices are: " + Arrays.toString(afterTax));
    for(int i = 0; i < afterTax.length; i++)
    {
      afterTax[i] += 0.13 * afterTax[i];
    }
    System.out.println("The after tax prices are: " + Arrays.toString(afterTax));
  }
}