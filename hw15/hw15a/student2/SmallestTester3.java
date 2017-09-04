import java.util.*;

/**
   A test program for the smallest method of the SmallestBinarySearchTree class
*/
public class SmallestTester3
{  
   public static void main(String[] args)
   {  
      SmallestBinarySearchTree nums = new SmallestBinarySearchTree();
      for (int i = 50; i < 150; i++)
         nums.add(17 * i % 100);

      System.out.println(nums.smallest());
      System.out.println("Expected: 0");
   }
}
