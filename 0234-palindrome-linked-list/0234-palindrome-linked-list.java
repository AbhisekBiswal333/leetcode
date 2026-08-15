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
    public boolean isPalindrome(ListNode head) {
        ListNode ptr=head;
        int l=0;
        while(ptr!=null){
            l++;
            ptr=ptr.next;
        }
       int mid=l/2;
       ptr=head;
       while(mid>0){
         ptr=ptr.next;
         mid--;
       }
       ListNode prev=null;  
        ListNode curr=ptr;
         while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
   
       ListNode ptr1=head;
       ListNode ptr2=prev;
       while(ptr2!=null){
         if(ptr1.val!=ptr2.val){
            return false;
         }
         ptr2=ptr2.next;
         ptr1=ptr1.next;
       }
       return true;
    }
}