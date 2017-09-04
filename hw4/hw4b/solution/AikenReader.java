//ID hw4b_draft
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

//ARGS questions.txt
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
      }
      return result;
   }   

   public ChoiceQuestion readQuestion() 
   {
      String text = next();
      ChoiceQuestion q = new ChoiceQuestion();
      q.setText(text);
      ArrayList<String> choices = new ArrayList<>();
      String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String input = next(); 
      while (!input.startsWith("ANSWER: "))
      {         
         int n = choices.size();
         choices.add(input.substring(3));
         input = next();
      }

      int a = letters.indexOf(input.substring(input.length() - 1));
      for (int i = 0; i < choices.size(); i++)
         q.addChoice(choices.get(i), i == a);
      return q;
   }   
}
