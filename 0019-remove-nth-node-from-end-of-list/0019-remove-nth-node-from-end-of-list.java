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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n < 2){
            return null;
        }
        ListNode ans = head;
        ListNode prev = null;

        while (head != null){
            ListNode temp = head;
            int cnt = 0;
            while (temp != null && cnt < n){
                cnt++;
                temp = temp.next;
            }

            if (temp == null && cnt == n){
                System.out.println(head.val + " ");
                if (prev == null){
                    ans= ans.next;
                }else{
                    prev.next = head.next;
                }
            }
            prev = head;
            head = head.next;
        }
        return ans;
    }
}