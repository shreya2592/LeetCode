// Time Complexity - O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] num= new int[2];
        Map<Integer, Integer> map= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                num[0]=map.get(target-nums[i]);
                num[1]=i;
                return num;
            }
            
            else{
                map.put(nums[i],i);
            }
        }
        return num;
    }
}