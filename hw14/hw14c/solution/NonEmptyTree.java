public class NonEmptyTree implements LispTree
{
   private Object data;
   private LispTree left;
   private LispTree right;
      
   public NonEmptyTree(Object data, LispTree left, LispTree right)
   {
      this.data = data;
      this.left = left;
      this.right = right;
   }
   public boolean empty() { return false; }
   public Object data() { return data; }
   public LispTree left() { return left; }
   public LispTree right() { return right; }
   public String toString() 
   { 
      return "t(" + data 
         + (left.empty() && right.empty() ? "" : 
            ", " + left + ", " + right) + ")";
   }
}
