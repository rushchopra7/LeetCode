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
    public boolean hasPathSum(TreeNode root, int targetSum) {
         return helper(root, targetSum);
    }

    public boolean helper(TreeNode t1, int target){
        if(t1 == null){
            return false;
        }
        if(t1.left ==  null && t1.right ==  null){
            return t1.val == target;
        }
        int remainingSum = target - t1.val;
        return(helper(t1.left,remainingSum) || helper(t1.right, remainingSum));
}
        }
        
    
