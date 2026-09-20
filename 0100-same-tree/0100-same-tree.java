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
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return sameTree(p,q);
    }

    private static boolean sameTree(TreeNode pNode, TreeNode qNode) {
        if(pNode==null && qNode==null) return true;
        if ( pNode==null || qNode ==null || pNode.val!= qNode.val) return false;
        return sameTree(pNode.left,qNode.left) && sameTree(pNode.right,qNode.right); 
    }
}