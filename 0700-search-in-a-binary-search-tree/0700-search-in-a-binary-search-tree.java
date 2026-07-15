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
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root,val);
    }
    public TreeNode search(TreeNode node,int val){
        if(node==null)
            return null;
        if(val==node.val)
            return node;
        if(node.left==null && node.right== null )
            return null;
        if(val<node.val)
            return search(node.left,val);
        else if(val>node.val)
            return search(node.right,val);
        return null;
    }
}