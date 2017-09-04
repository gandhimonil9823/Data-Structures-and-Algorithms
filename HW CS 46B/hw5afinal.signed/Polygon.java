

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
      this.corners = new ArrayList<Point2D.Double>();
   }
  
   /**
      Adds a point to the list.
      @param p the point to add
   */
   public void add(Point2D.Double p)
   {
      this.corners.add(p);   
   }
   
   /**
      Computes the area of a polygon.
      @return area of a polygon
   */
   public double getArea()
   {
	  
      Point2D.Double  triangle1 = corners.get(0);
      double x1 = triangle1.getX();
      double y1 = triangle1.getY();
      Point2D.Double  triangle2 = corners.get(1);
      double x2 = triangle2.getX();
      double y2 = triangle2.getY();
      Point2D.Double  triangle3 = corners.get(2);
      double x3 = triangle3.getX();
      double y3 = triangle3.getY();
      
      double theArea = Math.abs((x1 * y2) + (x2 * y3) + (x3 * y1) - (y1 * x2) - (y2 * x3) - (y3 * x1)) / 2;
   	  
      double number = 0;
          if(this.corners.size() <= 3)
    		  {
    			  return theArea;
    		  }
            else
            {
                Polygon anew = new Polygon();
                anew.add(this.corners.get(1));
//                Point2D.Double  addTriangle = corners.get(1);
//                anew.add(addTriangle);
	   
			   for(int i = 2; i < this.corners.size();++i)
			   {
//	                Point2D.Double  addTriangle1 = corners.get(i);
//	                anew.add(addTriangle1);
				   anew.add(this.corners.get(i));
				  
			   }
			   return  (theArea +  anew.getArea()); 
         }
   }
   }

   
      
   


