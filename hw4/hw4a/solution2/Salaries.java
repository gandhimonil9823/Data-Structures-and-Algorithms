//ID hw4a_final
//REQUIRED try\s*\(\s*Scanner
//Be sure to use the try-with-resources statement with the Scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

   public static boolean isInitial(String str)
   {
      return str.length() == 2 && str.endsWith(".");
   }

   public static void main(String[] args)
   {
      try 
      {
         try (Scanner in = new Scanner(new File(args[0]), "UTF-8"))
         {
            in.nextLine(); // Consume titles
            while (in.hasNextLine()) 
            {
               ArrayList<String> words = new ArrayList<String>();
               int sum = 0;
               Scanner line = new Scanner(in.nextLine());
            
               while (line.hasNext())
               {
                  String word = line.next();
                  if (word.startsWith("$"))
                  {
                     sum = sum + parse(word);
                  }
                  else if (sum == 0)
                     words.add(word);
               }
               int n = words.size();
               String last = words.get(n - 1);
               String middle = words.get(n - 2);
               String first = words.get(n - 3);
               if (isInitial(middle) || isInitial(first))
                  System.out.printf("%s %s %s", first, middle, last);
               else
                  System.out.printf("%s %s", middle, last);
               System.out.printf(" $%,d\n", sum);
            }
         }
      } 
      catch (FileNotFoundException e) 
      {
         System.out.println("File not found: " + args[0]);
      }
   }
}
