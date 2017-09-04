//ID hw5bdraft
public class Demolition
{
   //CALL "amber"
   //CALL "metronome"
   public static int cost(String s)
   {
      if (s.length() <= 1) return 0;
      String letter1 = s.substring(0, 1);
      String rest1 = s.substring(1);
      String letter2 = s.substring(s.length() - 1);
      String rest2 = s.substring(0, s.length() - 1);
      int c1 = cost(rest1) + cost(letter1, rest1);
      int c2 = cost(rest2) + cost(letter2, rest2);
      return Math.min(c1, c2);
   }

   public static int cost(String letter, String rest) 
   {
      return "aeiou".contains(letter) ? 0 : rest.length();
   }
}
