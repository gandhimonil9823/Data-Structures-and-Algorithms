//ID hw7bdraft
public class BulgarianSorter
{
   /**
      Sorts the three elements a[start], a[start + 1], a[start + 2].
      If start > a.length - 3, sorts the one or two remaining elements.
   */
   public static void sortThree(int[] a, int start)
   {
      if (start <= a.length - 3)
      {
         if (a[start] > a[start + 1])
            swap(a, start, start + 1);
         if (a[start + 1] > a[start + 2])
            swap(a, start + 1, start + 2);
         if (a[start] > a[start + 1])
            swap(a, start, start + 1);
      }
      else if (start <= a.length - 2 && a[start] > a[start + 1])
         swap(a, start, start + 1);
   }

   /**
      Swaps two entries of the array.
      @param a an array
      @param i the first position to swap
      @param j the second position to swap
   */
   private static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
