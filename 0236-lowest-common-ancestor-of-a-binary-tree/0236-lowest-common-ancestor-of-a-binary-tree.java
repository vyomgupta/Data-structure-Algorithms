/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public boolean nodetoRootPath(TreeNode root,TreeNode tar,List<TreeNode> ans){
        if(root == null){
            return false;
        }
        
        if(root.val == tar.val){
            return true;
        }
        
        ans.add(root);
        
        boolean left = nodetoRootPath(root.left,tar ,ans); 
        boolean right = nodetoRootPath(root.right,tar, ans);
        
        if(left || right){
            return true;
        }
        ans.remove(ans.size() - 1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        HashSet<Integer> set = new HashSet<>();
       List<TreeNode> pans = new ArrayList<>();
       List<TreeNode> qans = new ArrayList<>(); 
        
        nodetoRootPath(root,p,pans);
        pans.add(p);
        nodetoRootPath(root,q,qans);
        qans.add(q);
        
        for(TreeNode val : qans){
            set.add(val.val);
        }
        
         for(int i = pans.size() - 1 ; i >=0 ; i --){
             TreeNode v = pans.get(i);
             if(set.contains(v.val)){
                 return v;
             }
         }
    return root;
        
        

        
    }
}