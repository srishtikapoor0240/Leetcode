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
        return path(root,targetSum);
    }
    public boolean path(TreeNode node, int remaining){
        if(node==null)
            return false;
        remaining-=node.val;
        if(node.left==null && node.right==null)
            return remaining==0;
        
        return (path(node.left,remaining)||(path(node.right,remaining)));
    }
}