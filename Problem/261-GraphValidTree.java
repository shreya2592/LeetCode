class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        if(edges.length != n-1)
            return false;
        
        int[] nums= new int[n];
        
        Arrays.fill(nums,-1);
        
        for(int i=0;i<edges.length;i++){
            int x=find(nums, edges[i][0]);
            int y=find(nums, edges[i][1]);
            
            if(x==y)
                return false;
            else{
                nums[x]=y;
            }
        }
        
        return true;
        
    }
    
    public int find(int[] nums, int i){
        if(nums[i]==-1)
            return i;
        else
            return find(nums, nums[i]);
    }
}