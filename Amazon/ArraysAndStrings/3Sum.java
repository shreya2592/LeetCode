class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result= new ArrayList<>();
        
        if(nums==null || nums.length==0){
            return result;
        }
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int start=i+1, end=nums.length-1, target=0-nums[i];
            
            while(start<end){
                
                if(nums[start]+nums[end]==target){
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                
                    while(start<end && nums[start]==nums[start+1])
                        start++;
                    while(start<end && nums[end]==nums[end-1])
                        end--;
                    
                    start++;
                    end--;
                }
                
                else if( nums[start]+ nums[end]<target)
                    start++;
                else
                    end--;
            }
        }
        
        return result;
    }
}