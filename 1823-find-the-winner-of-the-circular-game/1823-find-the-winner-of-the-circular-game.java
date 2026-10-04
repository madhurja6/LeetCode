import java.util.Vector;
class Solution {
    public int findTheWinner(int n, int k) {
        Vector<Integer> v = new Vector<>();
        for (int i = 1; i <= n; i++) {
            v.add(i);
        }
        int index = 0;
        while (v.size() != 1) {
            int del = (index + k - 1) % v.size();
            v.remove(del);
            index = del;
        }
        return v.getFirst();
    }
}