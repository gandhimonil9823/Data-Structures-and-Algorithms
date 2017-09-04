public interface LispTree
{
   boolean empty();
   Object data();
   LispTree left();
   LispTree right();
   int height();
   int eval();   
}
