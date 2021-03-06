class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map= new HashMap<>();
        int[] num = new int[2];
        
        
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                num[0]=map.get(target-nums[i]);
                num[1]=i;
            }
            
            else{
                map.put(nums[i],i);
            }
        }
        
        return num;
        
    }
}