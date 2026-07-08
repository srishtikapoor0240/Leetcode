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
    HashMap <Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode build(int []p,int pleft,int pright,int[] in,int inleft,int inright){
        if(pleft>pright || inleft>inright)
            return null;
        TreeNode root=new TreeNode(p[pright]);
        int rootIndex= map.get(root.val);
        int leftSize=rootIndex-inleft;
        root.left=build(p,pleft,pleft+leftSize-1,in,inleft,rootIndex-1);
         root.right = build(p,pleft +leftSize  ,pright-1,in,rootIndex + 1,inright);
         return root;

    }
}