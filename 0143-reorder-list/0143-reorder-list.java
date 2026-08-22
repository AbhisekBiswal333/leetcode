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
    public void reorderList(ListNode head) {
        //mid
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       ListNode lefthead=head;
        ListNode righthead=prev;
        ListNode nextL,nextR;
        while(lefthead!=null&&righthead!=null){
            nextL=lefthead.next;
            lefthead.next=righthead;
            nextR=righthead.next;
            righthead.next=nextL;

            lefthead=nextL;
            righthead=nextR;
        }
    }
}