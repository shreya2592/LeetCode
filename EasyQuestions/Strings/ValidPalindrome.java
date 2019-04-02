class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        
        while(left<=right){
            if(!helper(s.charAt(left)))
                left++;
            else if(!helper(s.charAt(right)))
                right--;
            else{
                char c1=s.charAt(left);
                char c2=s.charAt(right);
                
                if(c1==c2 || c1== (c2^32)){
                    left++;
                    right--;
                }
                
                else
                    return false;
            }
            
        }
        
        return true;
    }
    
    public boolean helper(char c ){
        
        if(c>='a' && c<='z')
            return true;
        if(c>='A' && c<='Z' )
            return true;
        if(c>='0' && c<='9')
            return true;
        return false;
    }
}