public class Words
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.print("File name: ");
      String filename = new Scanner(System.in).nextLine();
      Scanner in = ...;
      in.useDelimiter("");
      while (in.hasNext())
      {
         String next = in.next(); // A string of length 1
         ...
      }
      ...
      System.out.println("Words: " + words);
      System.out.println("Sentences: " + sentences);
   }
}
