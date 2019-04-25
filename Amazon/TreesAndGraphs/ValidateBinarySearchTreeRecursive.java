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
    public boolean isValidBST(TreeNode root) {
        
        return helper(root, null, null);
        
    }
    
    public boolean helper(TreeNode root, Integer min, Integer max){
        
        if(root==null){
            return true;
        }
        
        if(min!=null && min>=root.val){
            return false;
        }
        
        if(max!=null && max<=root.val){
            return false;
        }
        
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}