/**
   This class analyzes the distribution of the first digit of values
   from a sequence.
*/
public class FirstDigitDistribution
{
   private int[] counters;

   /**
      Constructs a distribution whose counters are set to zero.
   */
   public FirstDigitDistribution()
   {
      counters = new int[10];
   }

   /**
      Processes values from this sequence.
      @param seq the sequence from which to obtain the values
      @param valuesToProcess the number of values to process
   */
   public void process(Sequence seq, int valuesToProcess)
   {
      for (int i = 1; i <= valuesToProcess; i++)
      {
         int value = Math.abs(seq.next());
         while (value > 9)
         {
            value /= 10;
         }
         counters[value]++;
      }
   }

   /**
      Display the distribution as a histogram
   */
   public void display()
   {
      int max = maxCounter();
      double scale = 40.0 / max;

      for (int i = 0; i < 10; i++)
      {
         System.out.print(i + ": ");
         int numStars = (int) (counters[i] * scale);
         for (int j = 0; j < numStars; j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   /**
      Determine the maximum counter
   */
   private int maxCounter()
   {
      int max = counters[0];

      for (int i = 1; i < 10; i++)
      {
         if (counters[i] > max)
         {
            max = counters[i];
         }
      }

      return max;
   }
}
