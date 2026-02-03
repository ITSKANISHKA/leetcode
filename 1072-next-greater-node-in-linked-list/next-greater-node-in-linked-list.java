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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        List<Integer> ll=new ArrayList<>();
        while(head!=null){
            ll.add(head.val);
            head=head.next;
        }
        int[] arr=new int[ll.size()];
        for(int i=ll.size()-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=ll.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=0;
            }else{
                arr[i]=st.peek();
            }
            st.push(ll.get(i));
        }return arr;
        
    }
}