class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int j = 0;
        boolean isNeg = false;
        StringBuilder sb = new StringBuilder();

        if (s.charAt(0) == '-') {
            isNeg = true;
            j = 1;
        } else if (s.charAt(0) == '+') {
            j = 1;
        }

        long val = 0;
        for (int i = j; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.append(c);
                val = val * 10 + (c - '0');
                if (!isNeg && val > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (isNeg && -val < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else {
                break;
            }
        }

        if (sb.length() == 0) return 0;
        return isNeg ? (int)(-val) : (int)val;
    }
}