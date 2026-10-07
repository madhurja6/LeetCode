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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][]matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(matrix[i],-1);
        }
        int lcol=0,rcol=n-1;
        int trow=0,brow=m-1;
        while (head!=null){
            for (int i = lcol; i <= rcol; i++) {
                if(head==null) break;
                matrix[trow][i]=head.val;
                head=head.next;
            }
            trow++;
            for (int i = trow; i <=brow ; i++) {
                if (head==null) break;
                matrix[i][rcol]=head.val;
                head=head.next;
            }
            rcol--;
            for (int i = rcol; i >=lcol ; i--) {
                if (head==null) break;
                matrix[brow][i]= head.val;
                head=head.next;
            }
            brow--;
            for (int i = brow; i >=trow ; i--) {
                if (head==null) break;
                matrix[i][lcol]=head.val;
                head=head.next;
            }
            lcol++;
        }
        return matrix;
    }
}