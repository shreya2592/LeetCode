// 7ms solution

class Solution {
    public String reverseWords(String s) {
        
        String[] words= s.split(" ");
        StringBuilder sb= new StringBuilder();
        for (String c : words){
            char[] letters=c.toCharArray();
            for (int i=letters.length-1;i>=0;i--){
               
                sb.append(letters[i]);
            }
            sb.append(" ");
            
        }        
        
              return sb.length()==0? "" : sb.substring(0,sb.length()-1);   
 
    }
}


// 100% solution- faster solution!

class Solution {
    public String reverseWords(String s) {
        
        if(s.length()==0)
            return s;
        
        int left=0;
        char[] str= s.toCharArray();
        while(s.indexOf(' ',left)!=-1){
            int right= s.indexOf(' ',left+1);
            reverse(left,right-1,str);
            left=right+1;
            
        }
        
        reverse(left, s.length()-1,str);
        return new String(str);
        
        
    }
    
    public void reverse(int left, int right, char[] str){
        while(left<right){
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
    }
}