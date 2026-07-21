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
    List <Integer>l=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int min=100000;
        for(int i=1;i<l.size();i++){
            if(l.get(i)-l.get(i-1)<min)
                min=l.get(i)-l.get(i-1);
        }
        return min;
    }
    public void inorder(TreeNode node){
        if(node==null)
            return;
        inorder(node.left);
        l.add(node.val);
        inorder(node.right);
    }
}