//ID hw14adraft
public class EmptyTree implements LispTree
{
   public boolean empty() { return true; }
   public Object data() { throw new UnsupportedOperationException(); }
   public LispTree left() { throw new UnsupportedOperationException(); }
   public LispTree right() { throw new UnsupportedOperationException(); }
   public String toString() { return "NIL"; }
}
