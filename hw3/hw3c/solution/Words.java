import java.util.Scanner;

public class Words
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int words = 0;
      while (in.hasNext())
      {
         in.next();
         words++;
      }
      System.out.println("Words: " + words);
   }
}
