/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int countA=0;
        int countB=0;
        while(tempA!=null){
            countA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            countB++;
            tempB=tempB.next;
        }
        int diff=Math.abs(countA-countB);
        tempA=headA;
        tempB=headB;
        if(countA>countB){
            for(int i=0;i<diff;i++){
                tempA=tempA.next;
            }
        }
        if(countA<countB){
            for(int i=0;i<diff;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;

    }
}