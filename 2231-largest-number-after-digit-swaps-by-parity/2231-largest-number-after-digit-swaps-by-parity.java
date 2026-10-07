class Solution {
    public int largestInteger(int num) {
        char[] s = String.valueOf(num).toCharArray();
        PriorityQueue<Integer> pqEven = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqOdd = new PriorityQueue<>(Collections.reverseOrder());
        int n = s.length;
        for (int i = 0; i < n; i++) {
            int digit = s[i] - '0';
            if (digit % 2 == 0) {
                pqEven.offer(digit);
                s[i] = 'E';
            } else {
                pqOdd.offer(digit);
                s[i] = 'O';
            }
        }
        for (int i = 0; i < n; i++) {
            if (s[i] == 'E') {
                s[i] = (char) (pqEven.poll() + '0');
            } else {
                s[i] = (char) (pqOdd.poll() + '0');
            }
        }
        return Integer.parseInt(new String(s));
    }
}