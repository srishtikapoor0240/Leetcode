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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder, 0, preorder.length - 1,
                     inorder, 0, inorder.length - 1);
        
           
        
    }
    public TreeNode build(int[] preorder, int preL, int preR,
                          int[] inorder, int inL, int inR) {

        if (preL > preR || inL > inR)
            return null;

        
        TreeNode root = new TreeNode(preorder[preL]);

        
        int rootIndex = map.get(root.val);

        
        int leftSize = rootIndex - inL;

        
        root.left = build(preorder,
                          preL + 1,
                          preL + leftSize,
                          inorder,
                          inL,
                          rootIndex - 1);

        
        root.right = build(preorder,
                           preL + leftSize + 1,
                           preR,
                           inorder,
                           rootIndex + 1,
                           inR);

        return root;
    }

}