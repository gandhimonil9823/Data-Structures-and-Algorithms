import java.util.*;

//ID hw8cfinal
public class Lists
{
   /**
      Splices the given string before each list element.
      @param a a string
      @param b a list
      @return a list that contains a before each element of b
   */
   public static LinkedList<String> splice(String a, LinkedList<String> b)
   {
      LinkedList<String> result = new LinkedList<>();
      ListIterator<String> iter = b.listIterator();
      while (iter.hasNext())
      {
         result.addLast(a);
         result.addLast(iter.next());
      }
      return result;
   }

   /**
      Splices the given lists.
      @param a a list
      @param b a list
      @return a list that contains alternating elements of a and b, 
      and if one list is longer than the other, the tail of the 
      longer list
   */
   public static LinkedList<String> splice(LinkedList<String> a, LinkedList<String> b)
   {
      LinkedList<String> result = new LinkedList<>();
      ListIterator<String> aiter = a.listIterator();
      ListIterator<String> biter = b.listIterator();
      while (aiter.hasNext() && biter.hasNext())
      {
         result.addLast(aiter.next());
         result.addLast(biter.next());
      }
      while (aiter.hasNext())
      {
         result.addLast(aiter.next());
      }
      while (biter.hasNext())
      {
         result.addLast(biter.next());
      }
      return result;
   }

   /**
      Removes all elements from b that end in the string a
      @param a a string
      @param b a list
   */
   public static void removeEndingWith(String a, LinkedList<String> b)
   {
      ListIterator<String> iter = b.listIterator();
      while (iter.hasNext())
      {
         String s = iter.next();
         if (s.endsWith(a)) iter.remove();
      }
   }
}
