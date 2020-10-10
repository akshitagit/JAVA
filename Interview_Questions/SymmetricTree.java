/*Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3

But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

>>>MY SOLUTION IS IMPLEMENTED BELOW
*/
package myquestions;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    
     //RECURSIVE SOLUTION
    
     //recursive function to find symmetricity
     public boolean isMirror(TreeNode tree1, TreeNode tree2)
     {
         //check whether either of the node is null
         //if both the nodes are null, true is returned
         //else false is returned
         if(tree1 == null || tree2 == null)
            return tree1 == tree2;
      
         //check whether values of two nodes is equal or not
         //if they not equal return false
         //if they are equal do nothing
         if(tree1.val != tree2.val)
             return false;
      
         //recursive calls for both left, right and right, left nodes of tree1 and tree2
         //the AND of these two calls is returned
         return isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);
       
     }
     public boolean isSymmetric(TreeNode root) {
         if(root == null)
             return true;
       
         //checking mirror images from second level 
         //as root(here 1 from example) is mirror of itself 
         return isMirror(root.left, root.right);
     }
     
}

public class SymmetricTree
{
    static TreeNode root;
    static TreeNode temp = root;
 
    /* Inorder traversal of a binary tree*/
    static void inorder(TreeNode temp)
    {
        if (temp == null)
            return;
 
        inorder(temp.left);
        System.out.print(temp.val + " ");
        inorder(temp.right);
    }
 
    /*function to insert element in binary tree */
    static void insert(TreeNode temp, int val)
    {
 
        if (temp == null) {
            root = new TreeNode(val);
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(temp);
 
        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
 
            if (temp.left == null) {
                temp.left = new TreeNode(val);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new TreeNode(val);
                break;
            }
            else
                q.add(temp.right);
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        root = new TreeNode(10);
        root.left = new TreeNode(11);
        root.left.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(8);

        System.out.print("Given Tree \n[ ");
        inorder(root);
        Solution obj = new Solution();
        if(obj.isSymmetric(root))
            System.out.println("] is Symmetric");
        else
            System.out.println("] is not Symmetric");
        
        root = new TreeNode(10);
        root.left = new TreeNode(11);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(11);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);

        System.out.print("Given Tree \n[ ");
        inorder(root);
        if(obj.isSymmetric(root))
            System.out.println("] is Symmetric");
        else
            System.out.println("] is not Symmetric");
    }
}