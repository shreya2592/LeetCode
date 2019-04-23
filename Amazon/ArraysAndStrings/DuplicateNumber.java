/* 
Solution: 1
Time Complexity- O(N log N )
Space Complexity - O(1)
The array is modified

*/


class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }

        return -1;
    }
}


/* 

Solution 2
Time Complexity- O(N)
Space Complexity- O(N)


*/

class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> set= new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            
            else{
                set.add(nums[i]);
            }
        }
        
        return -1;
    }
}


/* 

Solution 3
Time Complexty- O(N)
Space Complexity- O(1)

*/


class Solution {
    public int findDuplicate(int[] nums) {
        
        if(nums.length>1){
            int slow=nums[0];
            int fast=nums[nums[0]];
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[nums[fast]];
            }
            
            
            fast=0;
            while(fast!=slow){
                fast=nums[fast];
                slow=nums[slow];
            }
            
            return slow;
        }
        return -1;
    }
}

