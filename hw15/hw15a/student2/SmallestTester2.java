import java.util.*;

/**
   A test program for the smallest method of the SmallestBinarySearchTree class
*/
public class SmallestTester2
{  
   public static void main(String[] args)
   {  
      SmallestBinarySearchTree names = new SmallestBinarySearchTree();
      names.add("Romeo");
      names.add("Juliet");
      names.add("Tom");
      names.add("Dick");
      names.add("Harry");

      System.out.println(names.smallest());
      System.out.println("Expected: Dick");
   }
}
