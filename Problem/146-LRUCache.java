/*
Space = O(N) : Space heavy
getRecently used: o(1) super fast access 
access item = O(1) superfast update


Maintain a hashtable for a super fast access. 
maintain 2 empty pointer: 
    1. head= points to the start of the list
    2. tail - points to the end of the list; 
*/
import java.util.Hashtable;

class LRUCache {
    
    class DLinkedNode{
        int key; 
        int value;
        DLinkedNode next;
        DLinkedNode prev;
    }
    
    private void addToHead(DLinkedNode node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }
    
    private void removeNode(DLinkedNode node){
        DLinkedNode prev=node.prev;
        DLinkedNode next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    
    private void moveToHead(DLinkedNode node){
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode popTail(){
        DLinkedNode res=tail.prev;
        removeNode(res);
        return res;
    }
    
    private Hashtable<Integer, DLinkedNode> cache = new Hashtable<Integer, DLinkedNode>();
    
    private int size;
    private int capacity;
    private DLinkedNode head, tail;
    public LRUCache(int capacity) {
        this.size=0;
        this.capacity = capacity;
        
        head= new DLinkedNode();
        tail=new DLinkedNode();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        DLinkedNode node= cache.get(key);
        if(node==null)
            return -1;
        
        moveToHead(node);    
        return node.value;
    }
    
    public void put(int key, int value) {
        
        DLinkedNode node=cache.get(key);
        if(node==null){
            
            DLinkedNode newNode=new DLinkedNode();
            newNode.key=key;
            newNode.value=value;
            cache.put(key, newNode);
            addToHead(newNode);
            ++size;
            if(size>capacity){
                DLinkedNode res= popTail();
                cache.remove(res.key);
                --size;
            }
            
            
        }
        else{
                node.value=value;
                moveToHead(node);

            }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */