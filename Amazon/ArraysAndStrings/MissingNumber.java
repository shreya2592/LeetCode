class Solution {
    public int missingNumber(int[] nums) {
        
        int xor=0, i;
        for(i=0;i<nums.length;i++){
            xor=xor ^ i ^ nums[i];
        }
        
        return xor^i;
        
    }
}
