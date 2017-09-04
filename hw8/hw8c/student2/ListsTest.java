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
      names.addLast("Marie");
      LinkedList<String> greetings = new LinkedList<>();
      greetings.addLast("Hello");
      greetings.addLast("Hi");
      greetings.addLast("Bonjour");
      LinkedList<String> r = Lists.splice(greetings, names);
      assertEquals("[Peter, Paul, Marie]", names.toString());
      assertEquals("[Hello, Hi, Bonjour]", greetings.toString());
      assertEquals("[Hello, Peter, Hi, Paul, Bonjour, Marie]",
         r.toString());
   }

   @Test
   public void test2()
   {
      LinkedList<String> first = new LinkedList<>();
      first.addLast("Mary");
      first.addLast("a");
      first.addLast("lamb");
      LinkedList<String> second = new LinkedList<>();
      second.addLast("had");
      second.addLast("little");
      LinkedList<String> r = Lists.splice(first, second);
      assertEquals("[Mary, a, lamb]", first.toString());
      assertEquals("[had, little]", second.toString());
      assertEquals("[Mary, had, a, little, lamb]",
         r.toString());
   }

   @Test
   public void test3()
   {
      LinkedList<String> first = new LinkedList<>();
      first.addLast("its");
      first.addLast("was");
      LinkedList<String> second = new LinkedList<>();
      second.addLast("fleece");
      second.addLast("white");
      second.addLast("as");
      second.addLast("snow");
      
      LinkedList<String> r = Lists.splice(first, second);
      
      assertEquals("[its, was]", first.toString());
      assertEquals("[fleece, white, as, snow]", second.toString());
      assertEquals("[its, fleece, was, white, as, snow]",
         r.toString());
   }

   @Test
   public void test4()
   {
      LinkedList<String> lst = new LinkedList<>();
      lst.addLast("how");
      lst.addLast("much");
      lst.addLast("wood");
      lst.addLast("could");
      lst.addLast("a");
      lst.addLast("woodchuck");
      lst.addLast("chuck");
      lst.addLast("if");
      lst.addLast("a");
      lst.addLast("woodchuck");
      lst.addLast("could");
      lst.addLast("chuck");
      lst.addLast("wood");
      Lists.removeEndingWith("ould", lst);
      assertEquals("[how, much, wood, a, woodchuck, chuck, if, a, woodchuck, chuck, wood]",
         lst.toString());
   }

   @Test
   public void test5()
   {
      LinkedList<String> lst = new LinkedList<>();
      lst.addLast("how");
      lst.addLast("much");
      lst.addLast("wood");
      lst.addLast("could");
      lst.addLast("a");
      lst.addLast("woodchuck");
      lst.addLast("chuck");
      lst.addLast("if");
      lst.addLast("a");
      lst.addLast("woodchuck");
      lst.addLast("could");
      lst.addLast("chuck");
      lst.addLast("wood");
      Lists.removeEndingWith("beer", lst);
      assertEquals("[how, much, wood, could, a, woodchuck, chuck, if, a, woodchuck, could, chuck, wood]",
         lst.toString());
   }

   @Test
   public void test6()
   {
      LinkedList<String> first = new LinkedList<>();
      first.addLast("a");
      first.addLast("b");
      LinkedList<String> second = new LinkedList<>();
      LinkedList<String> r = Lists.splice(first, second);
      assertEquals("[a, b]", first.toString());      
      assertEquals("[]", second.toString());
      assertEquals("[a, b]", r.toString());      
   }
}
