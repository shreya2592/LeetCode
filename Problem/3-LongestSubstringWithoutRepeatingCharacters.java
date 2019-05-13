// Time Complexity= O(N)
// Space Complexity - O(min(m,n)) - where m - size of the charaset alphabet M  and n = size of string.


class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set= new HashSet<>();
        int i=0,j=0, result=0;
        int len= s.length();
        while(i<len && j<len){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                result=Math.max(result, j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        
        
        return result;
    }
}