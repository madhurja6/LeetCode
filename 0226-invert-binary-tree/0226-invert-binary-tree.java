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
    public TreeNode invertTree(TreeNode root) {
        invTree(root);
        return root;
    }
    private static void invTree(TreeNode Node) {
        if (Node == null) return;
        TreeNode t=Node.left;
        Node.left=Node.right;
        Node.right=t;
        invTree(Node.left);
        invTree(Node.right);
    }
}