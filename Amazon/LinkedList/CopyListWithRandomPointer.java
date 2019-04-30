// Time Complexity - O(N)
// Space Complexity - O(N)


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
        
        Map<Node, Node> map= new HashMap<>();
        Node cur=head;
        
        while(cur!=null){
            map.put(cur, new Node(cur.val));
            cur=cur.next;
        }
        
        
        cur =head;
        
        while(cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        
        return map.get(head);
    }
}