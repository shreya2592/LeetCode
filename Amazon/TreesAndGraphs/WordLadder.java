class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet= new HashSet<>(wordList);
        if(!wordSet.contains(endWord)){
            return 0;
        }
         
        Queue<String> queue= new LinkedList<>();
        queue.add(beginWord);
        int result= 0;
        
        while(!queue.isEmpty()){
            
            for(int k = queue.size(); k>0;--k){
                String word= queue.poll();
                 if(word.equals(endWord)){
                     return result+1;
                     
                 }
                
                for(int i=0;i<word.length();++i){
                    char[] newWord= word.toCharArray();
                    for(char ch='a'; ch<='z';ch++){
                        newWord[i]=ch;
                        String s= new String(newWord);
                        if(wordSet.contains(s) && !s.equals(word)) {
                            queue.offer(s);
                             wordSet.remove(s);
                             
                            }
                    }
                }
            }
            
            ++result; 
        }
        
        return 0;
        
    }
}