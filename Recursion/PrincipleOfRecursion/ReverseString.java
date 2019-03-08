class Solution {
    public void reverseString(char[] s) {
        
        helper(s, 0, s.length-1);
        
    }
    
    public void helper(char[] str, int start, int end){
        if(start>=end)
            return;
        
        char temp= str[start];
        str[start]=str[end];
        str[end]=temp;
        
        helper(str, start+1, end-1);
  
        
    }
}