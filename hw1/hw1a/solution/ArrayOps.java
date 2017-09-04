import java.util.ArrayList;

public class ArrayOps
{
//CALL new int[] { 2, 14, 9, 15, 9, 7, 3, 17, 14 }
//CALL new int[] { 61, 61 }
//CALL new int[] { 143 }
//CALL new int[] { 3, 5, 5, 5, 3, 3, 5, 3, 5 }
//CALL new int[] { }
//CALL new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 }   
   public static ArrayList<Integer> copyArray(int[] anArray)
   {
      ArrayList<Integer> uniqueIntegers = new ArrayList<Integer>();

      for (int i=0; i< anArray.length; i++)
      {
         boolean duplicate = false;
         for (int j = 0; j < i; j++)
         {
            if (anArray[i] == anArray[j])
            {
               duplicate = true;
            }
         }
         if (!duplicate)
         {
            uniqueIntegers.add(anArray[i]);
         }
      }

      return uniqueIntegers;
   }
}
