class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            for (int j = 0; j < ans.length() && j < s.length(); j++) {
                if (ans.charAt(j) == s.charAt(j)) {
                    sb.append(s.charAt(j));
                } else {
                    break;
                }
            }
            if (sb.length() == 0)
                return new String();
            ans = sb.toString();
            sb = new StringBuilder();
        }
        return ans;
    }
}