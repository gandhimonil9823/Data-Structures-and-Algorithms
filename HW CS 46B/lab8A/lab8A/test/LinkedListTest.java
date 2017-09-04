import java.util.Arrays;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays.*;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class LinkedListTest 
{
   private LinkedList sampleList;   

   @BeforeClass
   public static void start() 
   {
      Logger.global.addHandler(new StreamHandler(System.out, new SimpleFormatter()));
   }

   @Before
   public void setUp() 
   {
      sampleList = new LinkedList();
      sampleList.addFirst("lamb");
   }

   @Test
   public void testGet() 
   {
      Object result = ...;
      assertEquals(result, ...);
   }
}
