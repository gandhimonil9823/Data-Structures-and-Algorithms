import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SectionNumberChecker
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.print("File: ");
      Scanner in = new Scanner(System.in);
      String filename = in.nextLine();
      Scanner fileIn = new Scanner(new File(filename));
      String previous = null;
      Comparator<String> comp = new SectionNumberComparator();
      while (fileIn.hasNextLine())
      {
         String line = fileIn.nextLine();         
         Scanner lineIn = new Scanner(line);
         String first = "";
         if (lineIn.hasNext()) first = lineIn.next();
         if (isSectionNumber(first))
         {
            if (previous != null && comp.compare(previous, first) >= 0) 
               System.out.println(first + " should not come after " + previous);
            previous = first;
         }         
      }      
   }

   public static boolean isSectionNumber(String s)
   {
      int digits = 0;
      for (int i = 0; i < s.length(); i++)
      {
         String ch = s.substring(i, i + 1);
         if ("0123456789".contains(ch)) digits++;
         else if (ch.equals("."))
         {
            if (digits == 0) return false;
            digits = 0;            
         }
         else return false;
      }
      return true;
   }
}
