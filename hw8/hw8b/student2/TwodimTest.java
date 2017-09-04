import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TwodimTest
{
   public boolean isSorted(int[][] a)
   {
      for (int i = 0; i < a.length; i++)
      {
         for (int j = 0; j < a[i].length; j++)
         {
            int inext = i;
            int jnext = j + 1;
            if (jnext == a[i].length) { inext++; jnext = 0; }
            if (inext < a.length)
            {
               int elem = a[i][j];
               int nextElem = a[inext][jnext];
               if (elem > nextElem) return false; 
            }
         }
      }
      return true;
   }

   @Test
   public void test1()
   {
      int[][] values = { { 4, 9, 7, 8 },
                         { 4, 8, 4, 2 },
                         { 0, 9, 5, 3 } };
      Twodim.sort(values);
      assertTrue(isSorted(values));
   }

   @Test
   public void test2()
   {
      int[][] values = { { 4, 9, 7},
                         { 8, 4, 8 },
                         { 4, 2, 0 },
                         { 9, 5, 3 }};
      Twodim.sort(values);
      assertTrue(isSorted(values));
   }

   @Test
   public void test3()
   {
      int[][] values = { { 16, 3, 2, 13 },
                         { 5, 10, 11, 8 },
                         { 9, 6, 7, 12 },
                         { 4, 15, 14, 1 } };
      Twodim.sort(values);
      assertTrue(isSorted(values));
   }

   @Test 
   public void swapTest()
   {
      int[][] values = { { 16, 3, 2, 13 },
                         { 5, 10, 11, 8 },
                         { 9, 6, 7, 12 },
                         { 4, 15, 14, 1 } };
      Twodim.swap(values, 0, 0, 3, 3);
      assertEquals(1, values[0][0]);
      assertEquals(16, values[3][3]);
   }
}
