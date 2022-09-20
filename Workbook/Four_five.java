package Workbook;

public class Four_five {
    public static void main(String[] args) {
      System.out.println("Thank you for using the area calculator");
      System.out.println("This calculator lets you get the area of: \n\n");
      System.out.println("1 -- Square");
      System.out.println("2 -- Rectangle");
      System.out.println("3 -- Triangle");
      System.out.println("4 -- Circle");
  
      double aSqr = areaSquare(2);
      double aRec = areaRectangle(1,2);
      double aTri = areaTriangle(1,2);
      double aCir = areaCircle(2);
  
      System.out.println("\n");
      
      printAreas(aSqr, aRec, aTri, aCir);
  
    }
  
    public static double areaSquare(double side)
    {
      
      if(side < 0)
      {
        System.out.println("Impossible");
      
      }
      double area = Math.pow(side, 2);
      return area;
      
    }
  
    public static double areaRectangle(double length, double width)
    {
      if(length < 0 || width < 0)
      {
        System.out.println("Error: impossible");
        
      }
      double area = length * width;
      return area;
    }
   
    public static double areaTriangle(double base, double height)
    {
      if(base < 0 || height < 0)
      {
        System.out.println("Error: impossible");
        
      }
      double area = base * height/2;
      return area;
    }
  
    public static double areaCircle(double radius)
    {
      if(radius < 0)
      {
        System.out.println("Impossible");
        
      }
      double area = Math.PI * Math.pow(radius, 2);
      return area;
      
    }
  
    public static void printAreas(double square, double rectangle, double triangle, double circle)
    {
      
      System.out.println("Square area: " + square);
      System.out.println("Rectangle area: " + rectangle);
      System.out.println("Triangle area: " + triangle);
      System.out.println("Circle area: " + circle);
    }
  }
