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
      Comparator<String> comp = new SectionNumberComparator();
      ...
      while (...)
      {
         ...
         if (...)
         {
            System.out.println(section + " should not come after " + previous);
            ...
         }     
         ...
      }      
   }
}
