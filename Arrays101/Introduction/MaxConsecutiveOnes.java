class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int countMax = 0;
        
        for (int i : nums) {
            if (i == 1) {
                count ++;
            } else {
                countMax = Math.max(count, countMax);
                count = 0;
            }
        }
        
        return Math.max(count, countMax);
        
    }
}