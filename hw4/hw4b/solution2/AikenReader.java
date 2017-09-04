//ID hw4b_final
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

//ARGS questions.txt
//ARGS questions2.txt
//ARGS questions3.txt
//ARGS questions4.txt
//ARGS questions5.txt
//ARGS questions6.txt
//ARGS questions7.txt
//ARGS questions8.txt
//ARGS questions9.txt
//ARGS questions10.txt
//ARGS questions11.txt
//ARGS questions12.txt
//ARGS questions13.txt
//ARGS questions14.txt
public class AikenReader implements AutoCloseable
{
   private Scanner in;
   private String nextLine;   
   private boolean peeked;
   private int line;

   public AikenReader(String filename) throws FileNotFoundException
   {
      in = new Scanner(new File(filename));
      line = 0;
      nextLine = null;
      peeked = false;
   }

   public void close()
   {
      in.close();
   }

   private String peek() 
   {
      if (!peeked) 
      {
         peeked = true;
         if (in.hasNextLine()) 
         { 
            line++; 
            nextLine = in.nextLine(); 
         }
         else
         {
            nextLine = null;
         }
      }
      return nextLine;
   }

   private String next()
   {
      peek();
      peeked = false;
      return nextLine;
   }

   public ArrayList<ChoiceQuestion> readQuestions() 
   {
      ArrayList<ChoiceQuestion> result = new ArrayList<>();
      while (peek() != null)
      {
         ChoiceQuestion q = readQuestion();
         result.add(q);
         String after = peek(); 
         if ("".equals(after)) next(); // Consume blank line
         else if (after != null) 
            throw new SyntaxException(line);
      }
      return result;
   }   

   public ChoiceQuestion readQuestion() 
   {
      String text = next();
      if (text == null) throw new SyntaxException(line);
      ChoiceQuestion q = new ChoiceQuestion();
      q.setText(text);
      ArrayList<String> choices = new ArrayList<>();
      String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String input = next(); 
      if (input == null) throw new SyntaxException(line);
      while (!input.startsWith("ANSWER: "))
      {         
         int n = choices.size();
         if (input.length() < 3 || !letters.substring(n, n + 1).equals(input.substring(0, 1)) 
               || !".)".contains(input.substring(1, 2))
            || !" ".equals(input.substring(2, 3))) 
            throw new SyntaxException(line);
         choices.add(input.substring(3));
         input = next();
         if (input == null) throw new SyntaxException(line);
      }
      if (input.length() != "ANSWER: X".length())
         throw new SyntaxException(line);

      int a = letters.indexOf(input.substring(input.length() - 1));
      if (a < 0 || a >= choices.size()) throw new SyntaxException(line);
      for (int i = 0; i < choices.size(); i++)
         q.addChoice(choices.get(i), i == a);
      return q;
   }   
}
