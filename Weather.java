public class Weather 
{
  public static void main(String[] args) 
  {
    printTemperatures(77.0);
    printTemperatures(61.0);
    printTemperatures(55.0);
  }
  public static double fahrenheitToCelsius(double fahrenheit)
  {
    double celsius = (fahrenheit - 32) * 5/9;
    return celsius;
  }
  public static void printTemperatures(double fahrenheit)
  {
    System.out.println("Fahrenheit: " + fahrenheit);
    
    System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit) + "\n");
  }
}