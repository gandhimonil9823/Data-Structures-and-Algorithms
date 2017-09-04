import java.io.File;
import java.io.FileNotFoundException;
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
      ...
   }
}
