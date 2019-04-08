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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size =queue.size();
            for (int i=0;i<size;i++){
            TreeNode temp = queue.poll();
            list.add (temp.val);
            if(temp.left!=null)
                queue.add(temp.left);
            if (temp.right!=null)
                queue.add(temp.right);
            }
            result.add(0, list);
            
        }
        return result;
    }
}