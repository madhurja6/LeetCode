class Solution {
public ListNode middleNode(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while(l1 != null && l1.next != null){
            l1 = l1.next.next;
            l2 = l2.next;
        }
        return l2;
    }
}