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
        if (head == null || head.next == null)
            return head;
        ListNode a = head;
        ListNode b = a;
        int len = 0;
        while (a != null) {
            b = a;
            a = a.next;
            len++;
        }
        a = head;
        k = k % len;
        for (int i = 1; i < len - k; i++) {
            a = a.next;
        }
        b.next = head;
        head = a.next;
        a.next = null;
        return head;
    }
}