//Slow solution

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0;
        Set<Integer> set= new HashSet<>();
        
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                set.add(k);
                k=0;
            }
            else
                k=k+1;
        }
        
        set.add(k);
        
        System.out.println(set);
        int max=Collections.max(set);
        if(max==0)
            return 0;
        return max;
    }
    
}

//Fast Solution
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