import java.util.*;

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
      ...
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
      ...
   }

   /**
      Removes all elements from b that end in the string a
      @param a a string
      @param b a list
   */
   public static void removeEndingWith(String a, LinkedList<String> b)
   {
      ...
   }
}
