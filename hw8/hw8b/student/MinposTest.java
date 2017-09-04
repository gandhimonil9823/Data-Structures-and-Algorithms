import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MinposTest
{
   @Test
   public void test1()
   {
      int[][] values = { { 4, 9, 7, 8 },
                         { 4, 8, 4, 2 },
                         { 0, 9, 5, 3 } };
      int[] minPos = Twodim.minimumPosition(values, 0, 0);
      assertArrayEquals(new int[] {2, 0}, minPos);
   }

   @Test
   public void test2()
   {
      int[][] values = { { 4, 9, 7},
                         { 8, 4, 8 },
                         { 4, 2, 0 },
                         { 9, 5, 3 }};
      int[] minPos = Twodim.minimumPosition(values, 3, 0);
      assertArrayEquals(new int[] {3, 2}, minPos);
   }
}
