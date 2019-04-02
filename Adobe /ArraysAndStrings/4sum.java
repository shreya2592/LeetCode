class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result= new ArrayList<>();
        int len= nums.length;
        if(nums== null || len<4)
            return result;
        
        Arrays.sort(nums);
        
        for(int i=0;i<len-3;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            
            for(int j=i+1; j<len-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1])
                    continue;
                int start=j+1, end= len-1;
                while(start<end){
                    int sum=nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum<target)
                        start++;
                    else if(sum>target)
                        end--;
                    else{
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[start]);
                        res.add(nums[end]);
                        result.add(res);
                        
                        start++;
                        end--;
                        
                        while(start<end && nums[start]==nums[start-1])
                            start++;
                        while(start<end && nums[end]==nums[end+1])
                            end--;
                    }

                }
            }
        }
        
        return result;
        
    }
}