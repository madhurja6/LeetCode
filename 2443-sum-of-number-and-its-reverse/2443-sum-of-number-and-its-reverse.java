class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++) {
            StringBuilder sb = new StringBuilder();
            if (i + Integer.parseInt(sb.append(i).reverse().toString()) == num) return true;
        }
        return false;
    }
}