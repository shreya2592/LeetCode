// Time Complextity- O(N)
// Space COmplexity-)(N)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode head=node;
        int carry=0;
        int sum;
        
        while(l1!=null || l2!=null || carry!=0){
            
            ListNode cur= new ListNode(0);
            sum=(l1!=null?l1.val:0) +(l2!=null?l2.val:0)+carry;
            carry=sum/10;
            cur.val=sum%10;
            node.next=cur;
            node=cur;
            
            l1=l1==null?l1:l1.next;
            l2=l2==null? l2: l2.next;
            
        }
        
        return head.next;
        
    }
}