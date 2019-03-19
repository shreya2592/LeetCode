// Time Complexity - Best case - O(1)
// Time Complexity - Avg Case- O(log n)
// Time Complexity - Worst Case- O(log n)
//Space Complexity - O(1)



class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return -1;
        
        int start=0, end= nums.length-1,mid;
        while(end>=start){
            
            mid= (start+end)/2;
            if(nums[mid]==target)
                return mid;
            
            if(target>nums[mid])
                start=mid+1;
            else
                end = mid-1;
            
        }
        
        
        return -1;
        
    }
}