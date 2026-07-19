class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode nextNode = curr.next;
            int gcd=cal(curr.val, nextNode.val);
            curr.next=new ListNode(gcd);
            curr.next.next=nextNode;
            curr=nextNode;
        }
        return head;
    }
    private int cal(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}