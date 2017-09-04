import java.util.*;

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
      ...
   }
}
