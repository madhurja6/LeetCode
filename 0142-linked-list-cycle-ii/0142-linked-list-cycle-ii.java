/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        HashSet<ListNode> set = new HashSet<>();
        while (p != null) {
            if (!set.contains(p)) {
                set.add(p);
            } else {
                break;
            }
            p = p.next;
        }
        while (head != null) {
            if (head == p)
                return head;
            else
                head = head.next;
        }
        return head;
    }
}