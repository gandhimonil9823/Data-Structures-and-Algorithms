//ID hw5bfinal
public class Demolition
{
   private int cost;
   private String description;
   private Demolition restDemolition;

   public Demolition(String s)
   {
      if (s.length() <= 1) 
      {
         description = s;
      }
      else
      {
         String letter1 = s.substring(0, 1);
         String rest1 = s.substring(1);
         Demolition rest1Demolition = new Demolition(rest1);
         String letter2 = s.substring(s.length() - 1);
         String rest2 = s.substring(0, s.length() - 1);
         Demolition rest2Demolition = new Demolition(rest2);
         int c1 = rest1Demolition.getCost() + cost(letter1, rest1);
         int c2 = rest2Demolition.getCost() + cost(letter2, rest2);
         if (c1 <= c2)
         {
            cost = c1;
            description = letter1 + " " + rest1;
            restDemolition = rest1Demolition;
         }
         else
         {
            cost = c2;
            description = rest2 + " " + letter2;
            restDemolition = rest2Demolition;
         }
      }
   }

   public int getCost()
   {
      return cost;
   }

   public static int cost(String letter, String rest) 
   {
      return "aeiou".contains(letter) ? 0 : rest.length();
   }

   public String toString()
   {
      if (restDemolition == null) return description;
      else return description + " -> " + restDemolition.toString();
   }
}
