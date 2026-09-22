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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> po_order=new ArrayList<>();
        preOrder(root,po_order);
        return po_order;
    }

    private static void preOrder(TreeNode node, List<Integer> po_order) {
        if (node==null) return;
        preOrder(node.left,po_order);
        preOrder(node.right,po_order);
        po_order.add(node.val);
    }
}