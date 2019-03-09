//Time Complexit- O(n) and Space Complexity - O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        ListNode cur= head;
        
        while(cur!=null){
            ListNode nextTemp= cur.next; 
            cur.next=prev;
            prev= cur; 
            cur= nextTemp; 
        }
        
        return prev;
        
        
    }
}

