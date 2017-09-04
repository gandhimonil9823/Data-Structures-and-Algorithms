//ID hw13b
/**
   A bag is an unordered collection of possibly repeated elements.
*/

import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class Bag
{
   Node first;
   int modCount;

   /**
      A node holds an elements in this bag.
   */
   class Node
   {
      Object data;
      int count;
      Node next;
   }

   /**
      Constructs an empty bag.
   */
   public Bag()
   {
      first = null;
      modCount = 0;
   }

   /**
      Adds an object to this bag.
      @param obj the object to add
   */
   public void add(Object obj)
   {
      Node n = find(obj);
      if (n == null)
      {
         n = new Node();
         n.data = obj;
         n.count = 1;
         n.next = first;
         first = n;
      }
      else
      {
         n.count++;
      }
      modCount++;
   }

   /**
      Removes an object from this bag.
      @param obj the object to remove
   */
   public void remove(Object obj)
   {
      if (first == null) return;
      if (first.data.equals(obj))
      {
         if (first.count > 1) first.count--;
         else first = first.next;
      }
      else
      {
         Node n = first;
         while (n != null)
         {
            if (n.next != null && n.next.data.equals(obj))
            {
               if (n.next.count > 1) n.next.count--;
               else n.next = n.next.next;
               modCount++;
               return;
            }
            else n = n.next;
         }
      }
   }

   /**
      Counts how many times an object is contained in this bag.
      @param obj the object to find
      @return the number of times obj is in the bag
   */
   public int contains(Object obj)
   {
      Node n = find(obj);
      if (n == null) return 0;
      else return n.count;
   }

   /**
      Finds an object in this bag.
      @param obj the node containing obj or null
   */
   private Node find(Object obj)
   {
      Node n = first;
      while (n != null)
      {
         if (n.data.equals(obj)) return n;
         n = n.next;
      }
      return n;
   }

   /**
      Yields a string representation of this bag
      @return obj the string representation
   */   
   public String toString()
   {
      String result = "[";
      Node n = first;
      while (n != null)
      {
         for (int i = 0; i < n.count; i++)
         {
            if (result.length() > 1) result += ", ";
            result += n.data;
         }
         n = n.next;
      }
      return result + "]";
   }

   public Iterator iterator() { return new BagIterator(); }

   class BagIterator implements Iterator
   {
      private Node previous;
      private Node current;
      private int count;
      private boolean isAfterNext;
      private int modCount;
      
      public BagIterator()
      {
         previous = null;
         current = first;
         count = 0;
         isAfterNext = false;
         modCount = Bag.this.modCount;
      }

      public boolean hasNext()
      {
         if (modCount != Bag.this.modCount) 
            throw new ConcurrentModificationException();
         return current != null && (count < current.count || current.next != null);
      }

      public Object next()
      {
         if (modCount != Bag.this.modCount) 
            throw new ConcurrentModificationException();
         if (!hasNext()) 
            throw new NoSuchElementException();
         if (count >= current.count)
         {
            previous = current;
            current = current.next;
            count = 0;
         }
         Object result = current.data;
         count++;
         isAfterNext = true; 
         return result;
      }
   
      public void remove()
      {
         if (modCount != Bag.this.modCount) 
            throw new ConcurrentModificationException();
         if (!isAfterNext) 
            throw new IllegalStateException();
         current.count--;
         if (current.count == 0)
         {
            current = current.next;
            count = 0;
            if (previous == null)
               first = current;
            else
               previous.next = current;
         }
         isAfterNext = false;
         modCount++;
         Bag.this.modCount++;
      }
   }
}
