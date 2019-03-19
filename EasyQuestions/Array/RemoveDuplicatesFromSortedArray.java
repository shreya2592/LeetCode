class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        int k=1, len=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            
            else{
                nums[k]=nums[i];
                k++;
                len++;
            }
        }
        
        return len;
        
    }
}