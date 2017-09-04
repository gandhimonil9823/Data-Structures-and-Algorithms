public class Bag
{
   Node first;

   class Node
   {
      Object data;
      int count;
      Node next;
   }

   public Bag()
   {
      first = null;
   }

   public void add(Object obj)
   {
      // ...
   }

   public void remove(Object obj)
   {
      // ...
   }

   public int contains(Object obj)
   {
      // ...
   }

   public String toString()
   {
      String result = "[";
      // ...
      return result + "]";
   }
}
