/* 
Solution 1 : Naive approach- Sort the array 
Time Complexity - O( N log N)
Space Complexity - O(1)

*/


class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}


/*

Solution 2 : Using min heap (Priority Queue)
Time Complexity- O(nlog k )
*/


class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        
        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        
        
        return minHeap.remove();
        
    }
}