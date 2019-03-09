//Time Complexity - O(n) and Space Complexity - O(n) (Worst case when the tree is completely unbalanced) but in best case when the tree is completely balancedO(log(n))

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
    public int answer;
    public int maxDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        
        answer=1+ Math.max(maxDepth(root.left), maxDepth(root.right));
        return answer;
        
        
        
    }
}