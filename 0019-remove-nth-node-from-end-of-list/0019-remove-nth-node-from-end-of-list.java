/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int c=0;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=dummy;
        while(c<n)
        {
            curr=curr.next;
            c++;
        }
        while (curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }
         prev.next = prev.next.next;
        
        
        return dummy.next;
    }
}