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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k < 1){
            return head;
        }
        ListNode res = head;
        ListNode fast = head; 
        ListNode slow = head;
        int size = 0;

        while ( fast != null){
            fast = fast.next;
            size++;
        }
        fast = head;

        for (int i = 0; i < k % size; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next= res;
        res = slow.next;
        slow.next = null;

        return res;
    }
}