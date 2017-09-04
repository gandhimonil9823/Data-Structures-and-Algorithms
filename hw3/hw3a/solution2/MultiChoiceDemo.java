import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiChoiceDemo
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.print("Quiz file: ");
      Scanner in = new Scanner(System.in);
      String filename = in.nextLine();
      ArrayList<Question> quiz = readQuestions(filename);
      for (Question q : quiz)
         presentQuestion(q);
   }

   public static void presentQuestion(Question q) 
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }

   public static ArrayList<Question> readQuestions(String filename) throws FileNotFoundException
   {
      Scanner in = new Scanner(new File(filename));
      boolean done = false;
      ArrayList<Question> questions = new ArrayList<>();
      while (in.hasNextLine())
      {
         String text = in.nextLine();         
         ArrayList<String> lines = new ArrayList<>();
         String line;
         do
         {
            if (in.hasNextLine()) line = in.nextLine();
            else line = "";
            if (line.length() > 0) lines.add(line);
         }
         while (line.length() > 0);         

         if (lines.size() == 1)
         {
            Question q = new Question();
            q.setText(text);
            q.setAnswer(lines.get(0));
            questions.add(q);
         }
         else
         {
            int count = 0;
            for (String l : lines) 
               if (l.startsWith("*")) count++;
            
            ChoiceQuestion q;
            if (count == 1) q = new ChoiceQuestion();
            else q = new MultiChoiceQuestion();
            
            q.setText(text);
            for (String l : lines) 
               if (l.startsWith("*"))
                  q.addChoice(l.substring(1), true);
               else
                  q.addChoice(l, false);
            questions.add(q);               
         }
      }
      return questions;
   }
}
