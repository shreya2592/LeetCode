// Time Complexity - O(log n )

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int start=0, end =nums.length-1;
        int sum;
        int[] num= new int[2];
        while(start<end){
            sum = nums[start]+nums[end];
            if(sum==target){
                num[0]=start+1;
                num[1]=end+1;
                return num;
                }
            if(sum<target)
                start++;
            else
                end--;
        }
        
        return num;
        
    }
}