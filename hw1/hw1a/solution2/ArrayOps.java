import java.util.ArrayList;

public class ArrayOps
{
   public static int[] copyArrayList(ArrayList<Integer> anArrayList)
   {
      ArrayList<Integer> uniqueIntegers = new ArrayList<Integer>();

      for (Integer v : anArrayList)
      {
         if (!uniqueIntegers.contains(v)) uniqueIntegers.add(v);
      }

      int[] result = new int[uniqueIntegers.size()];
      for (int i = 0; i < result.length; i++) 
         result[i] = uniqueIntegers.get(i);

      return result;
   }
}
