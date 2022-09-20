public class Parameters {
    public static void main(String[] args) {
      areaRectangle(10, 15);
      areaRectangle(2, 12);
      areaRectangle(8, 32);
      areaRectangle(30, 150);
      areaRectangle(100, 42);
      
  
    }
    public static void areaRectangle(int width, int height)
    {
      int area = width * height;
      System.out.println("Area of a rectangle of width: " + width + " and height: " + height + " , is equal to " + area + "\n");
    }
  }