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
   public static ListNode swapPairs(ListNode head) {
        ListNode first = head;
        if (head==null) {
            return head;
        }
        ListNode l = head;
        int length = 0;
        while (l != null) {
            length++;
            l = l.next;
        }
       if (length==2){
            int val1 = first.val;
            first.val = first.next.val;
            first.next.val = val1;
        } else if (length % 2 == 0 && head!=null) {
            ListNode second = first.next;
            int val = first.val;
            first.val = second.val;
            second.val = val;
            do {
                if(second.next!=null){
                first = first.next.next;
                second = second.next.next;
                }
                int val1 = first.val;
                first.val = second.val;
                second.val = val1;
            } while (first.next != null && second.next != null);
        } else {
            ListNode second = first.next;
            while (first.next != null && second.next != null) {
                int val = first.val;
                first.val = second.val;
                second.val = val;
                if(second.next!=null){
                first = first.next.next;
                second = second.next.next;
                }
            }
        }
        return head;
    }
}