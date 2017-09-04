import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FrequencyTest
{
   @Test
   public void test1()
   {
      int[] a = { 1, 4, 4, 1, 1, 1, 5 };
      int[] f = Frequency.frequencyOfElements(a);
      assertArrayEquals(
         new int[] { 4, 2, 2, 4, 4, 4, 1 }, f);
   }

   @Test
   public void test2()
   {
      int[] a = { 1, 4, 5, 2, 6, 7, 8 };
      int[] f = Frequency.frequencyOfElements(a);
      assertArrayEquals(
         new int[] { 1, 1, 1, 1, 1, 1, 1 }, f);
   }

   @Test
   public void test3()
   {
      int[] a = { 4, 4, 4, 4, 4, 4, 4 };
      int[] f = Frequency.frequencyOfElements(a);
      assertArrayEquals(
         new int[] { 7, 7, 7, 7, 7, 7, 7 }, f);
   }

   @Test
   public void test4()
   {
      int[] a = { 4 };
      int[] f = Frequency.frequencyOfElements(a);
      assertArrayEquals(
         new int[] { 1 }, f);
   }

   @Test
   public void test5()
   {
      int[] a = { };
      int[] f = Frequency.frequencyOfElements(a);
      assertArrayEquals(
         new int[] { }, f);
   }
}
