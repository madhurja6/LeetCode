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
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head;
        ListNode q;
        while (p.next != null) {
            int num1 = p.val;
            int num2 = p.next.val;
            int res = gcd(num1, num2);
            ListNode r = new ListNode(res);
            r.next = p.next;
            p.next = r;
            p = p.next.next;
        }
        return head;
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int t = num2;
            num2 = num1 % num2;
            num1 = t;
        }
        return num1;
    }
}