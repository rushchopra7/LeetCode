/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSym(root,root); }
        /*if (root == null){
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while(!stack.isEmpty()){
         TreeNode node1 = stack.pop();
          TreeNode node2 = stack.pop();

          if (node1 == null && node2 == null) {
        continue;
      }

      // If one of the nodes is null, the binary tree
      // is not symmetric.
      if (node1 == null || node2 == null) {
        return false;
      }

      // If the values of the nodes are not equal, the
      // binary tree is not symmetric.
      if (node1.val != node2.val) {
        return false;
      }
      stack.push(node1.left);
      stack.push(node2.right);
      stack.push(node1.right);
      stack.push(node2.left);
    }

    // If the loop completes, the binary tree is
    // symmetric.
    return true; */
    
     public boolean isSym(TreeNode n1, TreeNode n2){
        if(n1==null && n2==null){
            return true;
        }
        if (n1==null || n2 ==null){
            return false;
        }
        return(n1.val == n2.val) &&  isSym(n1.left, n2.right)  && isSym(n1.right,n2.left);
     }

  }

        
       
        
        
    
