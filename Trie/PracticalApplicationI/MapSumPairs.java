class MapSum {

    /** Initialize your data structure here. */
    
    public class TrieNode{
        HashMap<Character, TrieNode> children;
        //boolean isWord;
        int value;
        TrieNode(){
            children= new HashMap<>();
           // isWord=false;
            value=0;
        }
    }
    
    private TrieNode root;
    public MapSum() {
        
        root=new TrieNode();
        
        
    }
    
    public void insert(String key, int val) {
        TrieNode cur= root;
        for(int i=0;i<key.length();i++){
            char c= key.charAt(i);
            if(cur.children.get(c)==null){
                cur.children.put(c, new TrieNode());
            }
            cur=cur.children.get(c);
        }
        
        //cur.isWord=true;
        cur.value=val;
    }
    
    public int sum(String prefix) {
        
       TrieNode curr = root;
	for (char c : prefix.toCharArray()) {
	    TrieNode next = curr.children.get(c);
	    if (next == null) {
	        return 0;
	    }
	    curr = next;
        }
		
        return dfs(curr);
    }
    
    private int dfs(TrieNode root) {
        int sum = 0;
        for (char c : root.children.keySet()) {
            sum += dfs(root.children.get(c));
        }
        return sum + root.value;
        
        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */