//Time Complexity- O(N)
//Space Complexity- O(N)

class Solution {
    public String reverseWords(String s) {
        
        if(s==null || s.length()==0)
            return "";
        
        String[] words= s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            
            if(!words[i].equals(""))
                sb.append(words[i]+ " ");
        }
        
        
                return sb.length()==0? "": sb.substring(0,sb.length()-1);

    }
}

