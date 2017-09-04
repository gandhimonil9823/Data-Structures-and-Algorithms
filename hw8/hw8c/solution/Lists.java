//ID hw8cdraft
import java.util.*;

public class Lists
{
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
}
