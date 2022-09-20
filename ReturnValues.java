public class ReturnValues
{
  public static void main(String[] args) 
  {
    double measure1 = measureRectangle(10, 23);
    double measure2 = measureRectangle(23, 12);
    double measure3 = measureRectangle(29, 92);
    double measure4 = measureRectangle(30, 42);

    stringPrinter(10, 23, measure1);
    stringPrinter(23, 12, measure2);
    stringPrinter(29, 92, measure3);
    stringPrinter(30, 42, measure4);
    
  }
  public static double measureRectangle(double width, double length)
  {
    double area = width * length;
    return area;
  }
  public static void stringPrinter(double width, double length, double area)
  {
    System.out.println("The area of a rectangle with width " + width + " ,length " + length + " is equal to " + area + "\n");
  }
}