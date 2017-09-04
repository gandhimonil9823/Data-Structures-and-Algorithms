//ID hw9a
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Lists {
   /**
    * Generate all permutations of a string.
    * @param s: the String to be evaluated.
    * @return an ArrayList of all permutations of s 
    */
   public static ArrayList<String> permutations(String s)
   {
      ArrayList<String> result = new ArrayList<>();
      Queue<String> q = new LinkedList<>();
        
      q.add("|" + s);
        
      while(q.size() > 0)
      {
	 String head = q.remove();
	 int i = head.indexOf("|");
	 String before = head.substring(0, i); // the part before |
	 String after = head.substring(i + 1); // the part after |
            
	 if (after.equals(""))
	    result.add(before);
	 else
	    for(int j = 0; j < after.length(); j++)
	       q.add(before + after.charAt(j)
		  + "|" + after.substring(0, j)
		  + after.substring(j + 1));
      }
      return result;
   }
}
