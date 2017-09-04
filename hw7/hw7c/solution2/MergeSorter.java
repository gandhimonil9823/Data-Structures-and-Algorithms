//ID hw7cfinal
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

         // If there were some elements that weren't merged in
         // this pass, then merge them now
         if (start + length < a.length)
         {
            merge(start, start + length - 1, a.length - 1, a, debug);
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

      int n = to - from + 1;
      // Size of the range to be merged

      // Merge both halves into a temporary array b
      int[] b = new int[n];

      int i1 = from;
      // Next element to consider in the first half 
      int i2 = mid + 1;
      // Next element to consider in the second half 
      int j = 0; // Next open position in b

      // As long as neither i1 nor i2 past the end
      while (i1 <= mid && i2 <= to)
      {
         // move the smaller element into b
         if (a[i1] < a[i2])
         {
            b[j] = a[i1];
            i1++;
         }
         else
         {
            b[j] = a[i2];
            i2++;
         }
         j++;
      }

      // Note that only one of the two while loops
      //  below is executed

      // Copy any remaining entries of the first half
      while (i1 <= mid)
      {
         b[j] = a[i1];
         i1++;
         j++;
      }
      // Copy any remaining entries of the second half
      while (i2 <= to)
      {
         b[j] = a[i2];
         i2++;
         j++;
      }

      // Copy back from the temporary array
      for (j = 0; j < n; j++)
      {
         a[from + j] = b[j];
      }
   }
}

