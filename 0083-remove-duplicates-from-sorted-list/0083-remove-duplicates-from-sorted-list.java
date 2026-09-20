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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        } else {
            ListNode l = head;
            ListNode l1 = head.next;
            while (l1 != null) {
                if (l.val == l1.val) {
                    l.next = l1.next;
                } else {
                    l = l.next;
                }
                    l1 = l1.next;
            }
        }
        return head;
    }
}