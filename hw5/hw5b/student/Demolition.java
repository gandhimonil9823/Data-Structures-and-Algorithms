public class Demolition
{
   public static int cost(String s)
   {
      ...
   }

   public static int stepCost(String letter, String rest) 
   {
      return "aeiou".contains(letter) ? 0 : rest.length();
   }
}
