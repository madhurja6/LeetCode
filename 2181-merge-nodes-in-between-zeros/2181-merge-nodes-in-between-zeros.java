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
    public static ListNode mergeNodes(ListNode head) {
        ListNode l=head;
        int sum=0;
        ListNode l2=new ListNode();
        ListNode l1=l2;
        while (l!=null){
            if (l.val!=0) {
                sum+= l.val;
            }
            if (l.val==0) {
                ListNode l3=new ListNode(sum);
                l1.next=l3;
                l1=l1.next;
                sum=0;
            }
            l=l.next;
        }
        ListNode l3=new ListNode(sum);
        l1.next=l3;
        l1=l2;
        while (l1.next!=null){
            if (l1.next.val==0) {
                if (l1.next!=null) l1.next=l1.next.next;
            }
            else l1=l1.next;
        }
        return l2.next;
    }
}