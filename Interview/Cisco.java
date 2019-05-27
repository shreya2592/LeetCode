// copy a binary tree

public class Cisco{

public class TreeNode{
    public int val; 
    public TreeNode left, right;
    TreeNode(int val){
        this.val=val;
        this.left=this.right=null;
    }
}


    public TreeNode cloneTree(TreeNode root){
        if(root==null){
            return null;
        }

        TreeNode newNode= new TreeNode(root.val);
        newNode.left=cloneTree(root.left);
        newNode.right= cloneTree(root.right);

        return newNode;
    }


}