//ID hw8bdraft
public class Twodim
{
   public static int[] minimumPosition(int[][] a, int r, int c)
   {
      int min = a[r][c];
      int[] minPos = new int[] { r, c };
      boolean done = false;
      int i = r;
      int j = c;
      while (!done) 
      {
         if (j < a[i].length - 1) j++;
         else if (i < a.length - 1) { i++; j = 0; }
         else done = true;

         if (!done)
         {
            if (a[i][j] < min)
            {
               min = a[i][j];
               minPos = new int[] { i, j };
            }
         }
      }
      return minPos;
   }
}
