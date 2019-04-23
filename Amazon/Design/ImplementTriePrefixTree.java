// Time Complexity : O(1) and worst case - O(log n)
// Space COmplexity - O(N*M)


class Trie {
    
    class TrieNode{
        HashMap<Character, TrieNode> children;
        boolean isWord;
        
        TrieNode(){
            children=new HashMap<>();
            isWord=false;
        }
    }

    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root= new TrieNode();
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            if(cur.children.get(c)==null){
                cur.children.put(c,new TrieNode());
            }
            
            cur=cur.children.get(c);
        }
        
        cur.isWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            if(cur.children.get(c)==null){
                return false;
            }
            
            cur=cur.children.get(c);
        }
        
     return cur.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
        
        TrieNode cur=root;
        for(int i=0;i<prefix.length();i++){
            char c= prefix.charAt(i);
            if(cur.children.get(c)==null)
                return false;
            
            cur=cur.children.get(c);
        }
        
        return true;
        
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */