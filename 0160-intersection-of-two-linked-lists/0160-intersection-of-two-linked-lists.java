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
        
        ListNode q=headB;
        while(q!=null){
ListNode p=headA;
        
        while(p!=null){
            if(p==q){
                return p;
            }
            p=p.next;

        }
        q=q.next;
        }
        return null;
    }
}