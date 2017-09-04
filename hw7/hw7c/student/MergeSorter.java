/**
   This class sorts an array, using the merge sort 
   algorithm nonrecursively.
*/
public class MergeSorter
{
   /**
      ...
   */
   public static void sort(int[] a, boolean debug)
   {
      int length = 1; // The size of the sorted regions; a power of 2

      // while the entire array hasn't yet been sorted
      while (length <= a.length)
      {
         int start = 0; // sort starts at the beginning of the array

         // for each pair of adjacent regions of the given length
         while (...)
         {
            // merge the pair into a sorted region of size 2 * length
            merge(..., ..., ..., 1, a, debug);
            start = start + ...;
         }
         ...
      }
   }

   /**
      ...
   */
   public static void merge(int from, int mid, int to, int[] a, boolean debug)
   {
      if (debug)
         System.out.println("Merging " + from + "..." + mid 
            + " and " + (mid + 1) + "..." + to);


   }
}

