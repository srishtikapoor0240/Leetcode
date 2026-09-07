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
    int max=0;
    public int dfs(TreeNode node,int max){
        if(node==null)
            return 0;
        int c=0;
        if(node.val>=max){
            c=1;;
        }
        max=Math.max(max,node.val);
        int left =dfs(node.left,max);
        int right= dfs(node.right,max);
        return c+left+right;
    }
    public int goodNodes(TreeNode root) {
        int max=0;
        int c=0;
        return dfs(root,root.val);
    }
}