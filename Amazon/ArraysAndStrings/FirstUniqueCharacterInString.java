// Time COmplexity - O(N)
// Space complexity - O(N)



class Solution {
    public int firstUniqChar(String s) {
        
        
        Map<Character, Integer> map = new HashMap<>();
        
        int len= s.length();
        for(int i=0;i<len;i++){
            char c= s.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        
        
        for(int i=0;i<len;i++){
            if(map.get(s.charAt(i))==1)
                return i;
        }
        
        return -1;
        
    }
}