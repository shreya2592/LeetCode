// Time Complexity = O(n log n) and Space COmplexity  - O(1)

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
             return false;
        
        char [] str1= s.toCharArray();
        char [] str2= t.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}



//Time Complexity - O(n) and Space Complexity - O(1)

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        char [] cArray= new char[26];
        for(int i =0;i<s.length();i++){
            cArray[s.charAt(i)-'a']++;
            cArray[t.charAt(i)- 'a']--;
        }
        for( int count: cArray){
            if(count!=0)
                return false;
        }
        
        return true;
    }
} 