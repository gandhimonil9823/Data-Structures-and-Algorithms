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
         ...
      }
   }

   public int getCost()
   {
      return cost;
   }

   public static int stepCost(String letter, String rest) 
   {
      return "aeiou".contains(letter) ? 0 : rest.length();
   }

   public String toString()
   {
      if (restDemolition == null) return description;
      else return description + " -> " + restDemolition.toString();
   }
}
