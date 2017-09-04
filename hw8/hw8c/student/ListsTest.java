import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ListsTest
{
   @Test
   public void test1()
   {
      LinkedList<String> names = new LinkedList<>();
      names.addLast("Peter");
      names.addLast("Paul");
      names.addLast("Mary");
      LinkedList<String> r = Lists.splice("Hello", names);
      assertEquals("[Hello, Peter, Hello, Paul, Hello, Mary]",
         r.toString());
   }

   @Test
   public void test2()
   {
      LinkedList<String> world = new LinkedList<>();
      world.addLast("cruel world");
      LinkedList<String> r = Lists.splice("Goodbye", world);
      assertEquals("[Goodbye, cruel world]",
         r.toString());
   }

   @Test
   public void test3()
   {
      LinkedList<String> nothing = new LinkedList<>();
      LinkedList<String> r = Lists.splice("Goodbye", nothing);
      assertEquals("[]",
         r.toString());
   }
}
