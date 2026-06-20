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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int c=0;
        if(head==null || head.next==null ){
            return head;
        }
        while(temp!=null){
            c++;
            temp=temp.next;
        }
         k=k%c;
        if(k==0){
           return head;
        }
        temp=head;
       
        ListNode newhead=null;
        for(int i=1;i<c-k;i++){
            temp=temp.next;
        }
        newhead=temp.next;
        temp.next=null;
        ListNode curr=newhead;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        return newhead;
    }
}