class Solution {
    public void moveZeroes(int[] nums) {
        
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                continue;
            else{
                nums[k]=nums[i];
                k++;
            }
            
            
        }
        
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
        
        
    }
}