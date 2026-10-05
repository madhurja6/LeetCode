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
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode l1 = head;
        ListNode l2 = head;
        while (l1 != null && l1.next != null) {
            l1 = l1.next.next;
            l2 = l2.next;
        }
        l1 = head;
        while (l1.next != l2) {
            l1 = l1.next;
        }
        l1.next = l1.next.next;
        return head;
    }
}