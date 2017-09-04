import java.util.*;

public class Set
{
   TreeMap<Integer, LinkedList<Object>> buckets;
   // No other instance variables

   /**
      Constructs an empty set.
   */
   public Set()
   {
      // draft
   }

   /**
      Tests for set membership.
      @param x an object
      @return true if x is an element of this set
   */
   public boolean contains(Object x)
   {
      // draft
   }

   /**
      Adds an element to this set.
      @param x an object
      @return true if x is a new object, false if x was
      already in the set
   */
   public boolean add(Object x)
   {
      // draft
   }

   /**
      Gets the number of elements in this set.
      @return the number of elements
   */
   public int size()
   {
      // draft
   }

   /**
      Removes an object from this set.
      @param x an object
      @return true if x was removed from this set, false
      if x was not an element of this set
   */
   public boolean remove(Object x)
   {
      // final
   }

   /**
      Returns an iterator that traverses the elements of this set.
      @return a hash set iterator
   */
   public Iterator iterator()
   {
      return new SetIterator();
   }

   class SetIterator implements Iterator
   {
      private Iterator<LinkedList<Object>> bucketIterator;
      private LinkedList<Object> currentBucket;
      private ListIterator<Object> current; 
      // No other instance variables

      /**
         Constructs an iterator that points to the
         first element of the set.
      */
      public SetIterator()
      {
         // final
      }

      public boolean hasNext()
      {
         // final
         return false;
      }
       
      public Object next()
      {
         // final
         return null;
      }

      public void remove()
      {
         // final
      }
   }
}


