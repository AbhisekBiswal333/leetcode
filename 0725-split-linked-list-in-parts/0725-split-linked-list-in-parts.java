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
    public ListNode[] splitListToParts(ListNode head, int k) {
       ListNode[]res=new ListNode[k];
       int n =0;
       ListNode curr=head;
       while(curr!=null){
         n++;
         curr=curr.next;
       } 
       int splitSize=n/k;
       int remainingSize=n%k;

       ListNode newCurr=head,
        prev=null;

        for(int i=0;i<k;i++){
            ListNode ans=newCurr;
            int size=splitSize;
            if(remainingSize > 0){
                size++;
                remainingSize--;
            }
            int j=0;
            while(j<size){
                prev=newCurr;
                newCurr = newCurr.next;
                j++;
            }
            if(prev!=null){
                prev.next=null;
            }
            res[i]=ans;
        }
        return res;
    }
}