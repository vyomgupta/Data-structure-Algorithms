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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> set = new HashSet<>();
        
        HashMap<Integer,TreeNode> map = new HashMap<>();
        
        for(int arr[] : descriptions){
            int parent = arr[0];
            int child  = arr[1];
            int pos =    arr[2];
            set.add(child);
            TreeNode parAddr = null;
            TreeNode childAddr = null;
            // map.containsKey(parent) == true? parAddr = map.get(parent) : parAddr = new TreeNode(parent);
            // map.containsKey(child) == true? childAddr = map.get(child) : childAddr = new TreeNode(child);
if (map.containsKey(parent)) {
    parAddr = map.get(parent);
} else {
    parAddr = new TreeNode(parent);
    map.put(parent, parAddr);
}

if (map.containsKey(child)) {
    childAddr = map.get(child);
} else {
    childAddr = new TreeNode(child);
    map.put(child, childAddr);
}

            
            map.put(parent,parAddr);
            map.put(child,childAddr);
            
           if (pos == 1) {
    parAddr.left = childAddr;
} else {
    parAddr.right = childAddr;
}

            }
        
        
         for(int arr[] : descriptions){
             if(set.contains(arr[0]) == false) return map.get(arr[0]);
         }
        return null;
        }
        
    }
