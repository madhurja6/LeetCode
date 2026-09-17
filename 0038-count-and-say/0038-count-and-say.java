class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        char [] sb = "1".toCharArray();
        for (int i = 1; i < n; i++) {
            StringBuilder sb1 = new StringBuilder();
            char ch1 = sb[0];
            int time = 1;
            for (int j = 1; j < sb.length; j++) {
                if (ch1 != sb[j]) {
                    sb1.append(time);
                    sb1.append(ch1);
                    time = 1;
                } else
                    time++;
                ch1 = sb[j];
            }
            sb1.append(time).append(ch1);
            sb = sb1.toString().toCharArray();
        }
        StringBuilder ans = new StringBuilder();
        for (char c : sb) {
            ans.append(c);
        }
        return ans.toString();
    }
}