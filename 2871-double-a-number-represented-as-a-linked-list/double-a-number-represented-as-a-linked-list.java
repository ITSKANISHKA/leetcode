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
    int num;
    public ListNode doubleIt(ListNode head) {
        num = 0;
        doubleLL(head);
        return ( num == 0) ? head : new ListNode(num,head);
    }
    public void doubleLL(ListNode head){
        if (head == null)return;
        doubleLL(head.next);
        int curr = 2 * head.val + num;
        num = curr / 10;
        head.val = curr % 10;
    }
}