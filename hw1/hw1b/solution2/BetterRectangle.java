//REQUIRED super\s*\(
//You must invoke the superclass constructor
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
   /**
      Constructs a new rectangle whose upper-left corner is specified as x,y) 
      and whose width and height are specified by the arguments of the same name.
      @param x the specified X coordinate
      @param y the specified Y coordinate
      @param width the width of the Rectangle
      @param height the height of the Rectangle
   */
   public BetterRectangle(int x, int y, int width, int height)
   {
      super(x, y, width, height);
   }

   /**
      Calculates the perimeter of the rectangle.
      @return the perimeter of the rectangle
   */
   public double getPerimeter()
   {
      return getHeight() * 2 + getWidth() * 2;
   }

   /**
      Calculates the area of the rectangle.
      @return the area of the rectangle
   */
   public double getArea()
   {
      return getHeight() * getWidth();
   }
}
