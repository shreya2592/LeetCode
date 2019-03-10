class Solution {
    public boolean isPalindrome(String s) {
        
        int left =0;
        int right= s.length()-1;
        while(left<right){
            
            if(!check(s.charAt(left)))
                left++;
            else if(!check(s.charAt(right)))
                right--;
            else{
                char ch1 = s.charAt(left);
                char ch2 = s.charAt(right);
                if(ch1==ch2 || ch1==(ch2^32)){
                    left++;
                    right--;
                    continue;
                }
                else
                    return false;
            }
        }
        
        return true;
        
    }
    
    public boolean check(char c){
        if(c>='a' &&c<='z')
            return true;
        if(c>='A' && c<='Z')
            return true;
        if(c>='0' && c<='9')
            return true;
        return false;
    }
}