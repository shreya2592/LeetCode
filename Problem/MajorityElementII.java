//Time Complexity  - O(N)
// Space Complexity - O(1)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        if(nums==null || nums.length==0)
            return new ArrayList<Integer>();
        
        int number1=nums[0],number2=nums[0], count1=0, count2=0, n=nums.length;
        List<Integer> result= new ArrayList<>();
        
        
        for(int i=0;i<n;i++){
            if(nums[i]==number1)
                count1++;
            else if(nums[i]==number2)
                count2++;
            else if(count1==0){
                number1=nums[i];
                count1=1;
            }
            else if(count2==0){
                number2=nums[i];
                count2=1;
            }
            
            else{
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]==number1)
                count1++;
            else if(nums[i]==number2)
                count2++;
        }
        
      
        
        if(count1>n/3)
            result.add(number1);
        if(count2>n/3)
            result.add(number2);
        return result;
    }
}