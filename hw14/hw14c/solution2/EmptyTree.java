//ID hw14afinal
public class EmptyTree implements LispTree
{
   public boolean empty() { return true; }
   public Object data() { throw new UnsupportedOperationException(); }
   public LispTree left() { throw new UnsupportedOperationException(); }
   public LispTree right() { throw new UnsupportedOperationException(); }
   public String toString() { return "NIL"; }

   public int height() { return 0; }
   public int eval() { throw new UnsupportedOperationException(); }
}
