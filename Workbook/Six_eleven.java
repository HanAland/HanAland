package Workbook;

import java.util.Arrays;

public class Six_eleven {
  public static void main(String[] args) {
    double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
    celciusToFahrenheit(celsius);

  }

  public static double[] celciusToFahrenheit(double[] celsius) {
    double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);

    for (int i = 0; i < fahrenheit.length; i++) {
      fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
    }
    return fahrenheit;

  }
}