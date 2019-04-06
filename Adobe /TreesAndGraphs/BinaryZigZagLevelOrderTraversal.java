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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int k=0;
        
        while (!queue.isEmpty()){
            ++k;
            List<Integer> list = new ArrayList<>();
            int size =queue.size();
            for (int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(k%2==0)
                    list.add (0,temp.val);
                else
                    list.add (temp.val);
                if(temp.left!=null)
                     queue.add(temp.left);
                 if (temp.right!=null)
                queue.add(temp.right);
            }
            result.add(list);
            
        }
        return result;
    }
}