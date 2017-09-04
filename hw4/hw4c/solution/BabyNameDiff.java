//ID hw4c_draft

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

//ARGS 2000s.txt 1990s.txt
//ARGS 1990s.txt 2000s.txt
public class BabyNameDiff
{
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<ArrayList<String>> result1 = read(args[0]);
      ArrayList<ArrayList<String>> result2 = read(args[1]);
      for (String b : result1.get(0))
         if (!result2.get(0).contains(b))
            System.out.println(b);
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
}
   

      

