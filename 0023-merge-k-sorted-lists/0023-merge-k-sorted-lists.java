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
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode l = head;
        for (int i = 0; i < lists.length; i++) {
            while (l.next != null) {
                l = l.next;
            }
            l.next = lists[i];
        }
        head = head.next;
        ListNode l1 = head;
        if (head != null) {
            ListNode l2 = head.next;
            while (l1.next != null) {
                while (l2 != null) {
                    if (l1.val > l2.val) {
                        int t = l1.val;
                        l1.val = l2.val;
                        l2.val = t;
                    }
                    l2 = l2.next;
                }
                l1 = l1.next;
                l2 = l1.next;
            }
        }
        return head;
    }
}