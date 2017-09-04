public class PointTester
{
   public static void main(String[] args)
   {
      Comparable p1 = new Point(3, 4);
      Point p2 = new Point(3, 4);

      System.out.println(p1.compareTo(p2) == 0);
      System.out.println("Expected: true");
   }
}
