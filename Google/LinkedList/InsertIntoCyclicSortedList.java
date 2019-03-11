/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
};
*/
class Solution {
    public Node insert(Node head, int val) {
        
        if(head==null){
            
            Node node= new Node(val,null);
            node.next=node;
            return node;
        }
        
        
        Node cur= head.next;
        Node prev= head;
        boolean flag=false;
        
        while(cur!=head){
            int next=cur.val;
            int pre=prev.val;

            if(val==pre || (val>pre && val<=next) || (next<pre && val> pre) || (next<pre && val<next)){
                flag=true;
                Node node = new Node(val);
                prev.next=node;
                node.next=cur;
                break;
                
            }
            
            prev=cur;
            cur=cur.next;
        }
        
        if(!flag){
            Node node= new Node(val);
            prev.next=node;
            node.next=cur;
        }
        
        return head;
        
    }
}