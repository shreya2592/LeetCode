/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        return helper(0, lists.length-1 , lists);
        
    }
    
    
    public ListNode helper(int s, int e, ListNode[] lists){
        
        if(s==e){
            return lists[s];
        }
        
        
        if(s<e){
            int q=(s+e)/2;
            ListNode l1= helper(s,q,lists);
            ListNode l2=helper(q+1,e, lists);
            
            return merge(l1,l2);
        }
        return null;
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
        if(l1.val<l2.val){
            l1.next=merge(l1.next,l2);
            return l1;
        }
        
        else{
            l2.next=merge(l1, l2.next);
            return l2;
        }
    }
}