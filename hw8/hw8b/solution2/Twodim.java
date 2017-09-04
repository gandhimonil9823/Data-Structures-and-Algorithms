//ID hw8bfinal
public class Twodim
{
   public static void sort(int[][] a)
   {
      for (int i = 0; i < a.length; i++)
         for (int j = 0; j < a[i].length; j++)
         {
            int[] minPos = minimumPosition(a, i, j);
            swap(a, minPos[0], minPos[1], i, j);
         }
   }

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

   public static void swap(int[][] a, int r1, int c1, int r2, int c2)
   {
      int temp = a[r1][c1];
      a[r1][c1] = a[r2][c2];
      a[r2][c2] = temp;
   }
}
