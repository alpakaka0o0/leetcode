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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;

        
        while (list1 != null || list2!=null){
            if (list1 != null && list2 != null){
                if (list1.val < list2.val){
                    answer.next = new ListNode(list1.val);
                    list1 = list1.next;
                }else{
                    answer.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }else if (list1 == null){
                answer.next = new ListNode(list2.val);
                list2 = list2.next;
            }else{
                answer.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            answer = answer.next;
        }
        return dummy.next;
    }
}