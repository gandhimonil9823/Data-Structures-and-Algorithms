import java.util.Comparator;

public class SectionNumberComparator implements Comparator<String> 
{
   public int compare(String a, String b)
   {
      String[] as = a.split("\\.");
      String[] bs = b.split("\\.");
      int i = 0;
      while (i < as.length && i < bs.length)
      {
         int ai = Integer.parseInt(as[i]);
         int bi = Integer.parseInt(bs[i]);
         if (ai < bi) return -1;
         if (ai > bi) return 1;
         i++;
      }
      return Integer.compare(as.length, bs.length);
   }
}
