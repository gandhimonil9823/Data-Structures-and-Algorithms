import java.util.*;

//ID hw8afinal
public class Frequency
{
   private static class Element implements Comparable<Element>
   {
      public int value;
      public int position;

      public Element(int value, int position)
      {
         this.value = value;
         this.position = position;
      }

      public int compareTo(Element other) 
      {
         return Integer.compare(value, other.value);
      }
   }

   /**
      Returns an array of the frequencies of each element in a.
      That is, if the returned array is f, then a[i] occurs f[i]
      times in a.
      @return the frequency array
   */
   public static int[] frequencyOfElements(int[] a)
   {
      Element[] e = new Element[a.length];
      for (int i = 0; i < a.length; i++)
      {
         e[i] = new Element(a[i], i);
      }

      Arrays.sort(e);

      int[] f = new int[a.length];

      int i = 0; 
      while (i < e.length)
      {
         // Find sequence with the same value
         int j = i;
         while (j < e.length && e[i].value == e[j].value) j++;
         // All the elements in [i, j) have the same value
         // That means, the value occurs j - i times
         // Look up the positions and set the frequencies
         for (int k = i; k < j; k++)
            f[e[k].position] = j - i;
         i = j; // continue at next value
      }

      return f;
   }
}
