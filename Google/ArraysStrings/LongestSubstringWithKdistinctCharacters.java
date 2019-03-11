class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
        if(k<=0)
            return 0;
        
        if(s.length()<=k)
            return s.length();
        
        Map<Character, Integer> map= new HashMap<>();
        int start=0, end=0, maxLen=0;
        
        while(end<s.length() && ((s.length() - start + 1) >maxLen)){
            Character c= s.charAt(end);
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c, map.get(c) + 1);
            
            
            if(map.size()>k){
                
                while(map.size()>k && start<=end){
                    Character startChar=s.charAt(start);
                    if(map.get(startChar)==1)
                        map.remove(startChar);
                    else
                        map.put(startChar, map.get(startChar)-1);
                         
                     start++;  
                }
            }
            
            if((end-start+1)>maxLen)
                maxLen=(end-start+1);   
            end++;
        }
          return maxLen;
    }
}        

        
     