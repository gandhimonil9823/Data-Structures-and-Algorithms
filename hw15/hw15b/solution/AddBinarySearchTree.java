//ID hw15b
import java.util.*;

/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/
public class AddBinarySearchTree
{  
   private Node root;

   /**
      Constructs an empty tree.
   */
   public AddBinarySearchTree()
   {  
      root = null;
   }
   
   /**
      Inserts a new node into the tree.
      @param obj the object to insert
   */
   public void add(Comparable obj) 
   {  
      Node newNode = new Node();
      newNode.data = obj;
      newNode.left = null;
      newNode.right = null;
      root = addNode(root, newNode);
   }

   /**
      Add the given new node to the given parent node.
      @param parent The parent node to be added to.
      @param newNode The node to be added.
   */
   public static Node addNode(Node parent, Node newNode)
   {
      if (parent == null) 
      {
         return newNode;
      }
      else
      {
         int comp = newNode.data.compareTo(parent.data);
         if (comp < 0)
         {  
            parent.left = addNode(parent.left, newNode);
         }
         else
         {  
            parent.right = addNode(parent.right, newNode);
         }
         return parent;
      }
   }

   public String toString()
   {  
      return toString(root);
   }  

   /**
      Produces a string of a node and all of its descendants in sorted order.
      @param parent the root of the subtree to process
   */
   private static String toString(Node parent)
   {  
      if (parent == null) { return ". "; }
      else 
      { 
         return "( " + toString(parent.left) 
            + parent.data + " " 
            + toString(parent.right) + ") "; 
      }
   }

   /**
      A node of a tree stores a data item and references
      to the left and right child nodes.
   */
   class Node
   {  
      public Comparable data;
      public Node left;
      public Node right;
   }
}

