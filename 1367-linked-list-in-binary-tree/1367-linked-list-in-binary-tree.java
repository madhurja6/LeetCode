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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        if (root.val == head.val) {
            if (listcheck(head, root)) return true;
        }
        return (isSubPath(head, root.left) || isSubPath(head, root.right));
    }

    private boolean listcheck(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;
        if (root.val != head.val) return false;
        return (listcheck(head.next, root.left) || listcheck(head.next, root.right));
    }
}