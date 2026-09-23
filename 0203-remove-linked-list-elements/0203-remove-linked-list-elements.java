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
    public static ListNode removeElements(ListNode head, int val) {
        ListNode l=new ListNode();
        ListNode l1=l;
        while (head!=null){
            if (head.val!=val){
                l1.next=head;
                l1=l1.next;
            }
            head=head.next;
        }
        l1.next=null;
        return l.next;
    }
}