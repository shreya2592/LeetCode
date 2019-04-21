// Time Complexity - O(N)
//Space Complexity= O(1)

public class Solution {
    public String reverseStr(String s, int k) {
        
        char[] ch= s.toCharArray();
        int len = ch.length;
        int i=0;
        while(i<len){
            int j=Math.min(i+k-1, len-1);
            swap(ch,i,j);
            i+=2*k;
            
        }
        return String.valueOf(ch);
    }
    
    private void swap(char[] ch, int start, int end){
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
}
