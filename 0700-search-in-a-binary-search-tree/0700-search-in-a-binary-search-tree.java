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
    
    public TreeNode solve(TreeNode root, int val){
        
        if(root == null) return null;
        if(root.val == val) return root;
   
        if(root.val < val){
          TreeNode right =  solve(root.right, val);
            if(right != null) return right;
        }
        if(root.val > val){
           TreeNode left = solve(root.left,val);
            if(left != null) return left;
        }
        return null;
    }
    public TreeNode searchBST(TreeNode root, int val){
        return solve(root, val);
        
    }
}