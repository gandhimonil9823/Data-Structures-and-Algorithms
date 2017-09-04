//ID hw14b
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
   
   /**
    * 
    */
   public void print(){
       root.print("");
   }
   
   class Node
   {
       public Object data;
       public List<Node> children;
      
       public void print(String prefix) {
           if (prefix.length() == 0) {
               System.out.println(data);
           } else {
               System.out.println(prefix.substring(0, prefix.length() - 3) + "+--" + data);
           }
           int i = 0;
           while (i < children.size()) {
               children.get(i).print(prefix + (i < children.size() - 1 ? "|  " : "   "));
               i++;
           }
       }
   }
}
