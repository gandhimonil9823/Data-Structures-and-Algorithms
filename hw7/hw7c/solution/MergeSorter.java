//ID hw7cdraft
/**
   This class sorts an array, using the merge sort 
   algorithm nonrecursively.
*/
public class MergeSorter
{
   /**
      Sorts the given array, using the merge sort 
      algorithm nonrecursively.
      @param a the array
      @param debug true to print a debug message
   */
   public static void sort(int[] a, boolean debug)
   {
      int length = 1; // The size of the sorted regions; a power of 2

      // while the entire array hasn't yet been sorted
      while (length <= a.length)
      {
         int start = 0; // sort starts at the beginning of the array

         // for each pair of adjacent regions of the given length
         while (start + 2 * length <= a.length)
         {
            // merge the pair into a sorted region of size 2 * length
            merge(start, start + length - 1, start + 2 * length - 1, a, debug);
            start = start + 2 * length;
         }
         length = length * 2; // Double the size of the regions
      }
   }

   /**
      @param from the starting index of the first region
      @param to the ending index of the first region and the 
      starting index of the second region
      @param to the ending index of the second region
      @param a the array
      @param debug true to print a debug message
   */
   public static void merge(int from, int mid, int to, int[] a, boolean debug)
   {
      if (debug)
         System.out.println("Merging " + from + "..." + mid 
            + " and " + (mid + 1) + "..." + to);
   }
}

