//ID hw2b
public class Point implements Comparable<Point>
{
   private double x;
   private double y;
   
   /**
      Constructs a point with given x- and y-components.
      @param x the x-component
      @param y the y-component
   */
   public Point(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   /**
      Returns the x-component of this point.
      @return the x-component
   */
   public double getX() { return x; }

   /**
      Returns the y-component of this point.
      @return the y-component
   */
   public double getY() { return y; }

   public int compareTo(Point other)
   {
      if (x < other.x) return -1;
      else if (x > other.x) return 1;
      else if (y < other.y) return -1;
      else if (y > other.y) return 1;
      else return 0;
   }
}
