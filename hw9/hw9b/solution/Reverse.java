//ID hw9b
//IGNORECASE false
import java.util.Scanner;
import java.util.Stack;
    
public class Reverse
{ 
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      Stack<String> stack = new Stack<>();
      while (scanner.hasNext())
      {
	 String word = scanner.next();
	 if (word.endsWith("."))
	 {
	    System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1));
	    while (stack.size() > 0)
	    {
	       String w = stack.pop();
	       if (stack.size() == 0)
		  w = w.substring(0, 1).toLowerCase() + w.substring(1);
	       System.out.print(" " + w);
	    }
	    System.out.print(". ");
	 }
	 else stack.push(word);
      }
      System.out.println();
   }
}
