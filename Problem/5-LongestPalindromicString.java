class Solution {
    
    private int start, max;
    public String longestPalindrome(String s) {
        
        int len=s.length();
        if(len<2){
            return s;
        }
        
        for(int i=0;i<len-1;i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        
        return s.substring(start, start+max);
    }
    
    private void helper(String s, int j, int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        
        if(max<k-j-1){
            start=j+1;
            max=k-j-1;
        }
    }
}