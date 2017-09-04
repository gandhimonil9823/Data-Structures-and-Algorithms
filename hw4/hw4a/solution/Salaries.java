//ID hw4a_draft
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

//ARGS salaries.txt   
//ARGS salaries2.txt
public class Salaries 
{
   public static int parse(String number)
   {
      String cleanedNumber = number.replace("$", "").replace(",", "");
      try
      {
         return Integer.parseInt(cleanedNumber);
      }
      catch (NumberFormatException ex)
      {
         return 0;
      }
   }

   public static void main(String[] args)
   {
      try 
      {
         String filename = args[0];
         try (Scanner in = new Scanner(new File(filename), "UTF-8"))
         {
            in.nextLine(); // Consume titles
            while (in.hasNextLine()) 
            {
               int sum = 0;
               Scanner line = new Scanner(in.nextLine());
            
               while (line.hasNext())
               {
                  String word = line.next();
                  if (word.startsWith("$"))
                  {
                     sum = sum + parse(word);
                  }
               }
               System.out.printf("$%,d\n", sum);
            }
         }
      } 
      catch (FileNotFoundException e) 
      {
         System.out.println("File not found: " + args[0]);
      }
   }
}
