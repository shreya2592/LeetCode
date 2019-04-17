// Time COmplexity - O(N)
// Space complexity - O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] n = new int[2];
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                n[0]= map.get(target-nums[i]);
                n[1]= i;
                return n;
            }
            
            else{
                map.put(nums[i],i);
            }
        }
        
        return n;
    }
}