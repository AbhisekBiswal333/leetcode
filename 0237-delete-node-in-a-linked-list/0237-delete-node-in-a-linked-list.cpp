/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        ListNode *ptr=node;
        ListNode *ptr1=node->next;

       ptr->val=ptr1->val;
       ptr->next=ptr1->next;
    }
};