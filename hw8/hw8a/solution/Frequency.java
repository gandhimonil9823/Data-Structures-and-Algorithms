//ID hw8adraft
public class Frequency
{
   /**
      Returns an array of the frequencies of each element in a.
      That is, if the returned array is f, then a[i] occurs f[i]
      times in a.
      @return the frequency array
   */
   public static int[] frequencyOfElements(int[] a)
   {
      int[] f = new int[a.length];
      for (int i = 0; i < a.length; i++)
         for (int j = 0; j < a.length; j++)
            if (a[i] == a[j]) f[i]++;
      return f;
   }
}
