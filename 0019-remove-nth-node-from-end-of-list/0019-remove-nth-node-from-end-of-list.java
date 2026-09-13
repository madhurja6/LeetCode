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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        int length = 0;
        while (l != null) {
            length++;
            l = l.next;
        }
        if (length - n == 0 || length == n) {
            head = head.next;
            return head;
        }
        ListNode m = head;
        for (int i = 1; i < length - n; i++) {
            m = m.next;
        }
        m.next = m.next.next;
        return head;
    }
}