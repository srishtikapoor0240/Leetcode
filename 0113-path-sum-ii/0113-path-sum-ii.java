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
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path=new ArrayList<>();
         dfs(root,targetSum,path);
         return l;
    }
    public void dfs(TreeNode node, int sum,List<Integer>inner){
        if(node==null)
            return;
        
        inner.add(node.val);
        sum-=node.val;
        if(node.left==null && node.right==null && sum==0)
        {
            l.add(new ArrayList<>(inner));
            
        }
        dfs(node.left,sum,inner);

        dfs(node.right,sum,inner);
        inner.remove(inner.size()-1);
    }
}