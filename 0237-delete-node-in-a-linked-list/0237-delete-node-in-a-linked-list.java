/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
      
        ListNode temp=node;
        ListNode temp1=node.next;
        
        temp.val=temp1.val;
        temp.next=temp1.next;
    }
}