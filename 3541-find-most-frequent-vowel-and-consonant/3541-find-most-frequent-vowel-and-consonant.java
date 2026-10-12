class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vow = new HashMap<>();
        HashMap<Character, Integer> con = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u':
                    vow.put(c, vow.getOrDefault(c, 0) + 1);
                    break;
                default:
                    con.put(c, con.getOrDefault(c, 0) + 1);
            }
        }
        int maxvow = 0;
        int maxcon = 0;
        if (!vow.isEmpty())
            maxvow = Collections.max(vow.values());
        if (!con.isEmpty())
            maxcon = Collections.max(con.values());
        return maxvow + maxcon;
    }
}