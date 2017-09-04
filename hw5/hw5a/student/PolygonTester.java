import java.awt.geom.Point2D;

/**
   A tester class for Polygon.
*/
public class PolygonTester
{
   public static void main(String[] args)
   {
      // square
      Polygon p = new Polygon();
      p.add(new Point2D.Double(10, 20));
      p.add(new Point2D.Double(20, 20));
      p.add(new Point2D.Double(20, 10));
      p.add(new Point2D.Double(10, 10));
      
      System.out.println("Area: " + p.getArea());
      System.out.println("Expected: 50.0");

      // regular hexagon with radius 1
      p = new Polygon();
      for (int i = 0; i < 6; i++)
         p.add(new Point2D.Double(Math.sin(i * Math.PI / 3),
               Math.cos(i * Math.PI / 3)));
      System.out.println("Area: " + p.getArea());
      System.out.println("Expected: " + Math.sqrt(3) / 4);      

      // Stop sign
      p = new Polygon();
      p.add(new Point2D.Double(10, 20));
      p.add(new Point2D.Double(20, 10));
      p.add(new Point2D.Double(20, -10));
      p.add(new Point2D.Double(10, -20));
      p.add(new Point2D.Double(-10, -20));
      p.add(new Point2D.Double(-20, -10));
      p.add(new Point2D.Double(-20, 10));
      p.add(new Point2D.Double(-10, 20));
      System.out.println("Area: " + p.getArea());
      System.out.println("Expected: " + 100);      
   }
}
