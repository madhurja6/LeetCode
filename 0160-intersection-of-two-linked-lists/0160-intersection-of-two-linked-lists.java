/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != null) {
            while (q != null) {
                if (p == q)
                    return p;
                else
                    q = q.next;
            }
            p = p.next;
            q = headB;
        }
        return null;
    }
}