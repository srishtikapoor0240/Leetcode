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
    int d=0;
    public int maxDepth(TreeNode root) {
        int ans=depth(root);
        return ans;
    }
    public int depth(TreeNode node){
        if(node==null)
            return 0;
        d=1+Math.max(depth(node.left),depth(node.right));
        return d;
    }
}