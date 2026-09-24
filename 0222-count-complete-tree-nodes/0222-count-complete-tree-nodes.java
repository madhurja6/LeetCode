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
    public int countNodes(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        inOrder(root,inorder);
        return inorder.size();
    }

    private static void inOrder(TreeNode node, List<Integer> inorder) {
        if (node==null) return;
        inOrder(node.left,inorder);
        inorder.add(node.val);
        inOrder(node.right,inorder);
    }
}