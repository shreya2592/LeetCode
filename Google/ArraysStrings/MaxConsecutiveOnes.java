class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0;
        int maxH=0;
        for(int n: nums){
            maxH= n==0? 0 : maxH+1;
            max=Math.max(max,maxH);
        }
        
        return max;
        
    }
}