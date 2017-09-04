//ID hw13a
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
      buckets = new TreeMap<>();
   }

   /**
      Tests for set membership.
      @param x an object
      @return true if x is an element of this set
   */
   public boolean contains(Object x)
   {
      int h = x.hashCode();
      LinkedList<Object> bucket = buckets.get(h);
      if (bucket == null) return false;
      else return bucket.contains(x);
   }

   /**
      Adds an element to this set.
      @param x an object
      @return true if x is a new object, false if x was
      already in the set
   */
   public boolean add(Object x)
   {
      int h = x.hashCode();
      LinkedList<Object> bucket = buckets.get(h);
      if (bucket == null) 
      {
         bucket = new LinkedList<>();
         buckets.put(h, bucket);
      }
      if (bucket.contains(x)) return false;
      else
      {
         bucket.addFirst(x);
         return true;
      }
   }

   /**
      Removes an object from this set.
      @param x an object
      @return true if x was removed from this set, false
      if x was not an element of this set
   */
   public boolean remove(Object x)
   {
      int h = x.hashCode();
      LinkedList<Object> bucket = buckets.get(h);
      if (bucket == null) 
      {
         return false;
      }
      else
      {
         boolean result = bucket.remove(x);
         if (bucket.size() == 0)
            buckets.remove(h);
         return result;
      }
   }

   /**
      Returns an iterator that traverses the elements of this set.
      @return a hash set iterator
   */
   public Iterator iterator()
   {
      return new SetIterator();
   }

   /**
      Gets the number of elements in this set.
      @return the number of elements
   */
   public int size()
   {
      int sum = 0;
      for (LinkedList<Object> s : buckets.values())
         sum += s.size();
      return sum;
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
         bucketIterator = buckets.values().iterator();
         if (bucketIterator.hasNext())
         {
            currentBucket = bucketIterator.next();
            current = currentBucket.listIterator();
         }
         else
            current = null; 
      }

      public boolean hasNext()
      {
         if (current == null) 
            return false; // empty set
         else if (current.hasNext())
            return true;
         else 
            return bucketIterator.hasNext();
      }
       
      public Object next()
      {
         if (hasNext())
         {
            if (!current.hasNext())
            {
               currentBucket = bucketIterator.next();
               current = currentBucket.listIterator();
            }
            return current.next();
         }
         else
            throw new NoSuchElementException();
      }

      public void remove()
      {
         if (current == null)
            throw new IllegalStateException();
         else 
         {
            current.remove();
            if (currentBucket.size() == 0)
               bucketIterator.remove();
         }
      }
   }
}


