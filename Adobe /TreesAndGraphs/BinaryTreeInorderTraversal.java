// Time Complexity= O(h) where h is the height of the binary tree!!

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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list= new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        while(true){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }
            
            else{
                if(stack.isEmpty())
                    break;
                root=stack.pop();
                list.add(root.val);
                root=root.right;
            }
        }
        
        return list;
        
    }
}