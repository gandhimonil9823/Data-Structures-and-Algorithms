public class BulgarianSorter
{
   public static void sort(int[] a)
   {
      
   }

   /**
      Sorts the three elements a[start], a[start + 1], a[start + 2].
      If start > a.length - 3, sorts the one or two remaining elements.
   */
   public static void sortThree(int[] a, int start)
   {
      
   }

   /**
      Checks whether the given array is sorted.
      @param a an array
      @return true if the array is sorted
   */
   public static boolean isSorted(int[] a)
   {
      return false;
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
