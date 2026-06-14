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
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }

        if(c==n){
            return head.next;
        }
        temp=head;
        int v=0;
        while(v!=c-n-1 ){
            v++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}