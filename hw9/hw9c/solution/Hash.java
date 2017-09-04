//ID hw9c
import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Hash
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      while (in.hasNext())
      {
	 String word = in.next();
	 int h = word.hashCode();
         System.out.println(h + ": " + word);
      }
   }
}
