public class PointTester
{
   public static void main(String[] args)
   {
      Measurable p1 = new Point(0, 0);

      System.out.println(p1.getMeasure());
      System.out.println("Expected: 0");
   }
}
