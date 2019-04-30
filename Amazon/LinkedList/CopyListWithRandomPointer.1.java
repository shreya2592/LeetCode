// Time Complexity - O(N)
// Space Complexity - O(1)

/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        
        if(head==null)
            return null;
        
        Node cur=head;
    
        while(cur!=null){
            Node newNode = new Node(cur.val, null, null);
            newNode.next=cur.next;
            cur.next=newNode;
            cur=newNode.next;
        }
    
        cur=head;
        
        while(cur!=null){
            cur.next.random=(cur.random!=null?cur.random.next:null);
            cur=cur.next.next;
        }
        
        
        cur=head;
        Node pointer=cur.next;
        Node root=cur.next;
        
        while(cur!=null){
            cur.next=cur.next.next;
            pointer.next=(pointer.next!=null)? pointer.next.next:null;
            cur=cur.next;
            pointer=pointer.next;
            
        }
        
        return root;
        
    
    }
}