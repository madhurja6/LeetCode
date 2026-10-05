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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int fCpi = -1;
        int pCpi = -1;
        int curr = 1;
        ListNode cur = head.next;
        ListNode prev = head;
        int res[] = new int[2];
        res[0] = Integer.MAX_VALUE;
        while (cur.next != null) {
            ListNode next = cur.next;
            if ((cur.val < next.val && cur.val < prev.val) || (cur.val > next.val && cur.val > prev.val)) {
                if (pCpi == -1) {
                    fCpi = curr;
                    pCpi = curr;
                } else {
                    res[0] = Math.min(res[0], curr - pCpi);
                    pCpi = curr;
                }
            }
            prev = prev.next;
            cur = cur.next;
            curr++;
        }
        if (fCpi != -1 && res[0] != Integer.MAX_VALUE) {
            res[1] = pCpi - fCpi;
        } else {
            res[0] = -1;
            res[1] = -1;
        }
        return res;
    }
}