//Time Complexity- O(n^2)
//Space Complexity - O(result)
class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        
        List<List<Integer>> result= new ArrayList<>();
        
        if(num==null ||  num.length<3)
            return result;
        
        Arrays.sort(num);
        
        for(int i=0; i < num.length-2;i++){
            
            if(i>0 && num[i]==num[i-1])
                continue;
            
            int start=i+1, end=num.length-1, target= 0-num[i];
            while(start<end){
                if(num[start]+num[end]== target){
                    result.add(Arrays.asList(num[i], num[start], num[end]));
                    while(start<end && num[start]==num[start+1])
                        start++;
                    while(start<end && num[end]==num[end-1])
                        end--;
                    start++;
                    end--;
                }
                
                else if(num[start]+num[end]<target)
                    start++;
                else
                    end--;
            }
            
        }
    
        return result;
}
}
