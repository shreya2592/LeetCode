// Time COmplexity - O( m+n)
// Space Complexity - O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    
        ListNode preHead= new ListNode (-1);
        ListNode prev=preHead;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                prev.next=l1;
                l1=l1.next;
            }
            else{
                prev.next=l2;
                l2=l2.next;
                
            }
            prev=prev.next;
        }
        
        prev.next=l1==null ? l2: l1;
        
        return preHead.next;
    }
}

