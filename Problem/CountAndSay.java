// Time Complexity: 

class Solution {
    public String countAndSay(int n) {
        
        String s="1";
        for(int i=1;i<n;i++){
            s=helper(s);
        }
        
        
        return s;
        
    }
    
    
    public String helper(String str){
        StringBuilder sb= new StringBuilder();
        char c= str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==c)
                count++;
            else{
                sb.append(count);
                sb.append(c);
                c= str.charAt(i);
                count=1;
            }
        }
        
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}