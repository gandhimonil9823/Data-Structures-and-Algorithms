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
      Map<Integer, TreeSet<String>> hashCodes = new TreeMap<>();
      Scanner in = new Scanner(System.in);
      while (in.hasNext())
      {
	 String word = in.next();
	 int h = word.hashCode();
	 TreeSet<String> words = hashCodes.get(h);
	 if (words == null) words = new TreeSet<>();
	 words.add(word);
	 hashCodes.put(h, words);
      }
      for (int h : hashCodes.keySet())
      {
	 TreeSet<String> words = hashCodes.get(h);
	
	 if (words.size() > 1)
	 {
	    System.out.print(h + ": ");
	    boolean first = true;
	    for (String w: words)
	    {
	       if (first) first = false; else System.out.print(", ");
	       System.out.print(w);
	    }
	    System.out.println();
	 }
      }
   }
}
