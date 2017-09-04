//ID hw5adraft
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
   A polygon with a number of Point2D.Double corners
*/
public class Polygon
{
   private ArrayList<Point2D.Double> corners;

   /**
      Constructs a Polygon object with no corners
   */
   public Polygon()
   {
      corners = new ArrayList<Point2D.Double>();
   }
   
   /**
      Adds a point to the list.
      @param p the point to add
   */
   public void add(Point2D.Double p)
   {
      corners.add(p);   
   }
   
   /**
      Computes the area of a polygon.
      @return area of a polygon
   */
   public double getArea()
   {
      Point2D.Double p1 = corners.get(0);
      Point2D.Double p2 = corners.get(1);
      Point2D.Double p3 = corners.get(2);

      double x1 = p1.getX();
      double y1 = p1.getY();     
      double x2 = p2.getX();
      double y2 = p2.getY();         
      double x3 = p3.getX();
      double y3 = p3.getY(); 
      
      double area = Math.abs((x1 * y2) 
         + (x2 * y3) 
         + (x3 * y1) 
         - (y1 * x2) 
         - (y2 * x3) 
         - (y3 * x1)) 
         / 2;

      return area;
   }
}
