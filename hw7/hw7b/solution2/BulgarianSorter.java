//ID hw7bfinal
public class BulgarianSorter
{
   public static void sort(int[] a)
   {
      while (!isSorted(a))
      {
          for (int i = 0; i < a.length; i += 2)
             sortThree(a, i);
      }
   }

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
      Checks whether the given array is sorted.
      @param a an array
      @return true if the array is sorted
   */
   public static boolean isSorted(int[] a)
   {
      for (int i = 0; i < a.length - 1; i++)
      {
         if (a[i] > a[i+1])
            return false;
      }
      return true;
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









public class BulgarianSorter
{
	public static void sort(int[] a)
	{
		while(!isSorted(a))
		{
			for(int i =0 ; i < a.length; i = i + 2)
			{
				sortThree(a,i);
			}
		}

	}


	/**
      Sorts the three elements a[start], a[start + 1], a[start + 2].
      If start > a.length - 3, sorts the one or two remaining elements.
	 */
	public static void sortThree(int[] a, int start)
	{
		int curr_index = start;
		while(isSorted(a) == false)
		{
			while (curr_index < a.length) {
				start = curr_index;
				if( start > a.length - 3)
				{
					if(start == a.length - 2)
					{
						if( a[start] < a[start + 1])
						{
							return;
						}
						else if(a[start] > a[start + 1])
						{
							BulgarianSorter.swap(a,start,start + 1);
						}
						else
						{
							return;
						}
					}

					return;
				}
				else if(start <= a.length - 3)
				{
					if(a[start] > a[start + 1] )
					{
						BulgarianSorter.swap(a, start,start + 1);
						if (a[start+1] > a[start+2]) {
							BulgarianSorter.swap(a, start+1,start+2);
							if (a[start]>a[start+1])
							{
								BulgarianSorter.swap(a, start, start+1);
							}
						}
					}
					if(a[start+1]>a[start+2])
					{
						BulgarianSorter.swap(a,start+1,start +2);
						if (a[start] > a[start+1]) {
							BulgarianSorter.swap(a, start,start + 1);
						}
					}
					if(a[start]>a[start +2])
					{
						BulgarianSorter.swap(a,start,start+2);
					}
				}
				curr_index += 3;
				if (curr_index >= a.length) 
					return;
			}	   
		}
	}



	/**
      Checks whether the given array is sorted.
      @param a an array
      @return true if the array is sorted
	 */
	public static boolean isSorted(int[] a)
	{
		for(int i=0; i< a.length -1; i++)
		{
			if(a[i] > a[i+1])
			{
				return false;
			}

		}
		return true;
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
