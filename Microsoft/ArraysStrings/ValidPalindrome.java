class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            if (!validCharacter(s.charAt(left))){
                left ++;
            }else if (!validCharacter(s.charAt(right))){
                right --;
            }else{
                    char ch1 = s.charAt(left);
                    char ch2 = s.charAt(right);
                    if (ch1 == ch2 || ch1 == (ch2^32)){
                        left ++;
                        right --;
                        continue;                    
                    }
                    return false;
            }
        }
        return true;
    }
    private boolean validCharacter(char ch){
        if (ch >= '0' && ch <= '9')
            return true;
        if (ch >= 'a' && ch <= 'z')
            return true;
        if (ch >= 'A' && ch <= 'Z')
            return true;
        return false;
    }
}