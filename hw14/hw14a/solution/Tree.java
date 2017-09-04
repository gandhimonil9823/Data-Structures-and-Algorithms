//ID hw14a
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
   
   public int interiorNodes(){
       return root.interiorNodes();
   }
   
   class Node
   {
       public Object data;
       public List<Node> children;
       
       public int interiorNodes(){
           if (children.isEmpty())
               return 0;
           else{
               int sum = 1;
               for (Node child: children){
                  sum = sum + child.interiorNodes();
               }
               return sum;
           }
       }
   }
}
