//ID hw11a
public class Ring
{
   Node start;

   class Node
   {
      Node next;
      Node previous;
      Object data;
   }

   public Ring(int initialSize)
   {
      if (initialSize <= 0) throw new IllegalArgumentException();
      Node previous = null;
      for (int i = 0; i < initialSize; i++)
      {
         Node newNode = new Node();
         if (i == 0) start = newNode;
         else
         {
            previous.next = newNode;
            newNode.previous = previous;
         }
         previous = newNode;
      }
      previous.next = start;
      start.previous = previous;
   }

   public void forward()
   {
      start = start.next;
   }

   public void backward()
   {
      start = start.previous;
   }

   public Object get()
   {
      return start.data;
   }

   public Object set(Object newValue)
   {
      Object oldValue = start.data;
      start.data = newValue;
      return oldValue;
   }

   public void add(Object newValue)
   {
      Node newNode = new Node();
      newNode.data = newValue;
      newNode.next = start;
      start.previous.next = newNode;
      newNode.previous = start.previous;
      start.previous = newNode;
   }

   public Object remove()
   {
      if (start.next == start) throw new IllegalStateException();
      Object removed = start.data;
      start.previous.next = start.next;
      start.next.previous = start.previous;
      start = start.next;
      return removed;
   }
}
