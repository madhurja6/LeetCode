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
    public boolean isSymmetric(TreeNode root) {
        return symTree(root,root);
    }
    private static boolean symTree(TreeNode lNode, TreeNode rNode) {
        if (lNode == null && rNode == null) return true;
        if (lNode == null || rNode == null || lNode.val != rNode.val) return false;
        return symTree(lNode.left, rNode.right) && symTree(lNode.right, rNode.left);
    }
}