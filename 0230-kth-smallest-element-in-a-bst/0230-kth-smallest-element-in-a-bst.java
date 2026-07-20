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
/*class Solution {
    List <Integer> list= new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder (root);
        return list.get(k-1);
    }
    public void inorder (TreeNode node){

        if(node== null)
            return ;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);

    } 
}*/

class Solution {
    int c=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k){
         inorder(root ,k);
         return ans;
    }
    public void inorder(TreeNode node,int k){
        if(node==null || c>=k)
            return ;
        inorder(node.left,k);
        c++;
         if(c==k){
            ans= node.val;
            return;
         }

        inorder(node.right,k);
        
    }
}