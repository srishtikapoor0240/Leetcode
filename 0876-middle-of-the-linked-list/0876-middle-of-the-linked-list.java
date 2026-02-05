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


/*class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            
            c++;
            temp=temp.next;
        }
        temp=head;
        int p=0;
        while(p!=c/2){
            temp=temp.next;
            p++;

        }
        return temp;
    }
}
*/

//OPTIMAL SOL USING SLOW FAST POINTER

class Solution 
{
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}