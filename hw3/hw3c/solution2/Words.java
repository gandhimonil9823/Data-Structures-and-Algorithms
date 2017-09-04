import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Words
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.print("File name: ");
      String filename = new Scanner(System.in).nextLine();
      Scanner in = new Scanner(new File(filename), "UTF-8");
      int words = 0;
      int sentences = 0;
      in.useDelimiter("");
      boolean inWord = false;
      int consecutivePeriods = 0;
      while (in.hasNext())
      {
         char ch = in.next().charAt(0); // getting the first character of the next element
         if (Character.isLetter(ch) || ch == '\'')
         {
            consecutivePeriods = 0;
            if (!inWord)       
            {
               inWord = true;
               words++;            // word count is incremented if it is a new word
            }
         }
         else {
            inWord = false;             
            if (ch == '.')
            {
               consecutivePeriods++;         // else it is checked for ellipsis and sentence count is incremented
               if (consecutivePeriods == 1) sentences++;
               else if (consecutivePeriods == 2) sentences--;
            }
            else consecutivePeriods = 0;
            if (ch == '?' || ch == '!') sentences++;
         }
      }
      System.out.println("Words: " + words);
      System.out.println("Sentences: " + sentences);
   }
}
