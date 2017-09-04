import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

public class BabyNameDiff
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filename1 = args[0];
      String filename2 = args[1];
      ...
   }

   private static ... read(String filename) throws FileNotFoundException
   {
      Scanner in = new Scanner(new File(filename));
      ...
   }
}
   

      

