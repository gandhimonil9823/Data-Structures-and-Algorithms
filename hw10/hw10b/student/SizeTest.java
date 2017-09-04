import org.junit.*;
import static org.junit.Assert.*;

public class SizeTest
{  
   @Test public void test3()
   { 
      LinkedList names = new LinkedList();
      names.addFirst("Peter");
      names.addFirst("Paul");
      names.addFirst("Mary");
      assertEquals(3, names.size1());
      assertEquals(0, names.size2());
      assertEquals(0, names.size3());
   }

   @Test public void test0()
   { 
      LinkedList names = new LinkedList();
      assertEquals(0, names.size1());
      assertEquals(0, names.size2());
      assertEquals(0, names.size3());
   }
}
