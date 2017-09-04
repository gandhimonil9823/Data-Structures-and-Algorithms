import java.io.FileNotFoundException;
import java.util.Scanner;

public class AikenReaderDemo
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filename = args[0];
      AikenReader reader = new AikenReader(filename);
      for (Question q : reader.readQuestions())
         q.display();
   }
}
