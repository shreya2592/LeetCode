class Solution {
    public int countComponents(int n, int[][] edges) {
        
        int[] nums= new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=i;
        }
        
        for(int i=0;i<edges.length;i++){
            int x= find(nums, edges[i][0]);
            int y=find(nums, edges[i][1]);
            
            if(x!=y){
                nums[y]=x;
            }
        }
        
        int count =0;
        for(int i=0;i<n;i++){
            if(nums[i]==i){
                count++;
            }
        }
        
        return count;
    }
    
    
    public int find(int[] nums, int i ){
        while(nums[i]!=i){
            nums[i]=nums[nums[i]];
            i=nums[i];
        }
        
        return i;
    }
}