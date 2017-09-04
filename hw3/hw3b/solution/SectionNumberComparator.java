import java.util.Comparator;

public class SectionNumberComparator implements Comparator<String> 
{
   //CALL "1.1", "1.2"
   //CALL "1.12", "1.11"
   //CALL "1.2", "1.2"
   //CALL "10", "10.2"
   //CALL "10.2", "10"
   //CALL "1.12", "2"
   //CALL "1.21", "2.11"
   //CALL "2.11", "1.21"
   //CALL "1.12.3", "1.12"
   //CALL "1.12.13", "1.12.14.1"
   //CALL "1.2.3", "3.14"
   //CALL "1.12.3", "1.12.3.4.5"
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
