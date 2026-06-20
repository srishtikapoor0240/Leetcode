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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        
        while(prev.next!=null){
            int curr=prev.next.val;
            if(prev.next.next!=null && prev.next.next.val==curr){
                while(prev.next!=null && prev.next.val==curr){
                    prev.next=prev.next.next;
                }
            }
            else{
                prev=prev.next;
            }
        }
        return dummy.next;
    }
}