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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue= new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);
        
        while(root!=null && !queue.isEmpty()){
            int size=queue.size();
            List<Integer> list2= new ArrayList<>();
            
            for(int i=0; i<size; i++){
                
                root=queue.poll();
                list2.add(root.val);
                
                if(root.left!=null)
                    queue.add(root.left);
                
                if(root.right!=null)
                    queue.add(root.right);
                
            }
            
            list.add(list2);
        }
        
        return list;
    }
}