import java.util.ArrayList;
import java.util.List;

public class Tree
{  
   private Node root;
   
   /**
      Constructs a tree with one node and no children.
      @param rootData the data for the root
   */
   public Tree(Object rootData)
   {
      root = new Node();
      root.data = rootData;
      root.children = new ArrayList<>();
   }
   
   /**
      Adds a subtree as the last child of the root.
   */
   public void addSubtree(Tree subtree)
   {
      root.children.add(subtree.root);
   }
   
   public void print()
   {
      if (root != null) root.print("");
   }
   
   class Node
   {
      public Object data;
      public List<Node> children;
      
      public void print(String prefix) 
      {
         ...
      }
   }
}
