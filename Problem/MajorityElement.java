// Time Complexity: O (n)
// Space Complexity: O(1)



class Solution {
    public int majorityElement(int[] nums) {
        
        int result=0, count=0;
        
        for(int i=0;i<nums.length;i++){
            if(count==0){
                result=nums[i];
                count ++;
            }
            
            else if(nums[i]==result)
                count ++;
            
            else
                count--;
        }


        // This loop is optional- It's to check if the majority element doesn't exists!
        
        count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==result)
                count++;
        }
        
        if(count>=nums.length/2)
            return result;
        else
            return -1;
        
        
        
        
       
    }
}