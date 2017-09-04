public class Ring
{
   Node start; // The current position

   class Node
   {
      Node next;
      Node previous;
      Object data;
   }

   /**
      Construct a ring with the given initial size, and all data set to null.
      @param initialSize the initial size of the ring
   */
   public Ring(int initialSize)
   {
      if (initialSize <= 0) throw new IllegalArgumentException();
      // Draft: Only needs to work for initialSize == 3

      // ...
   }

   /**
      Moves the current position forward.
   */
   public void forward()
   {
      // ...      
   }

   /**
      Moves the current position backward.
   */
   public void backward()
   {
      // ...      
   }

   /**
      Gets the current element.
      @return the value
   */
   public Object get()
   {
      return start.data;
   }

   /**
      Sets the current element.
      @param newValue the new value
      @return the old value
   */
   public Object set(Object newValue)
   {
      // ...      
   }

   /**
      Adds an element before the current element.
      @param newValue the value to add
   */
   public void add(Object newValue)
   {
      // ...      
   }

   /**
      Removes the current element and makes the next element the current one. 
      @return the old value
      @throws IllegalStateException if ring only has one element
   */
   public Object remove()
   {
      if (start.next == start) throw new IllegalStateException();
      Object removed = start.data;
      
      // ...

      return removed;
   }
}
