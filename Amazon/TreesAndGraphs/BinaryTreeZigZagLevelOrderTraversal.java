
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        
        queue.add(root);
        int k=0;
        while(root!=null && !queue.isEmpty()){
            ++k;
            int size= queue.size();
            List<Integer> list2= new ArrayList<>();
            for(int i=0;i<size;i++){
                root=queue.poll();
                
                if(k % 2==0)
                    list2.add(0,root.val);
                else
                    list2.add(root.val);
                
                if(root.left!=null)
                     queue.add(root.left);
                 if (root.right!=null)
                queue.add(root.right);
                
            }
            
            list.add(list2);
        }
        
        return list;
        
    }
}

