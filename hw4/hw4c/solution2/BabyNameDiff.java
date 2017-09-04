//ID hw4c_final

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

//ARGS 1990s.txt 1980s.txt
//ARGS test1.txt test2.txt
public class BabyNameDiff
{
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<ArrayList<String>> result1 = read(args[0]);
      ArrayList<ArrayList<String>> result2 = read(args[1]);
      show(result1, result2);
      System.out.println();
      show(result2, result1);
   }

   private static ArrayList<ArrayList<String>> read(String filename) throws FileNotFoundException
   {
      try (Scanner in = new Scanner(new File(filename)))
      {
         ArrayList<ArrayList<String>> result = new ArrayList<>();
         result.add(new ArrayList<>());
         result.add(new ArrayList<>());
         while (in.hasNextLine())
         {
            String[] line = in.nextLine().split("\\s+");
            result.get(0).add(line[1]);
            result.get(1).add(line[3]);
         }
         for (ArrayList<String> r : result) Collections.sort(r);
         return result;
      }
   }

   private static void show(ArrayList<ArrayList<String>> result1,
      ArrayList<ArrayList<String>> result2)
   {

      ArrayList<String> left = new ArrayList<>();
      ArrayList<String> right = new ArrayList<>();

      for (String b : result1.get(0))
         if (!result2.get(0).contains(b))
            left.add(b);

      for (String g : result1.get(1))
         if (!result2.get(1).contains(g))
            right.add(g);

      for (int i = 0; i < Math.max(left.size(), right.size()); i++)
         System.out.printf("%-30s%-30s\n",
            i < left.size() ? left.get(i) : "",
            i < right.size() ? right.get(i) : "");
   }
}
   

      

