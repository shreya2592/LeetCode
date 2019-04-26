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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list= new ArrayList<>();
        helper(root, list);
        return list;
        
    }
    
    
    public void helper(TreeNode root, List<Integer> list){
        if(root!=null){
            helper(root.left, list);
            helper(root.right, list);
            list.add(root.val);
        }
    }
}