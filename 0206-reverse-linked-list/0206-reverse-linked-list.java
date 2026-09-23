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
    public static ListNode reverseList(ListNode head) {
        if (head==null){
            return head;
        } else {
            ListNode l = head;
            int length = 0;
            while (l != null) {
                length++;
                l = l.next;
            }
            if (length==1){
                return head;
            }
            ListNode l1 = head;
            int i = 1;
            while (i < length) {
                ListNode l2 = head;
                for (int j = 1; j < length; j++) {
                    if (l2.next != null) {
                        l2 = l2.next;
                    }
                }
                int t = l1.val;
                l1.val = l2.val;
                l2.val = t;
                l1 = l1.next;
                length--;
                i++;
            }
            return head;
        }
    }
}