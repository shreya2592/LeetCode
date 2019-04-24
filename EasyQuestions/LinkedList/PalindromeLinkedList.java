/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        
        slow=reversed(slow);
        fast=head;
        
        while(slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            
            fast=fast.next;
            slow=slow.next;
        }
        
        return true;
    }
    
    public ListNode reversed(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        
        
        return prev;
    }
}