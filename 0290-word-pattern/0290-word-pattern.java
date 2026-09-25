class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        char []p = pattern.toCharArray();
        if (p.length != s1.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            if (!map.containsKey(p[i]) && !map.containsValue(s1[i])) {
                map.put(p[i], s1[i]);
            } else if (map.containsKey(p[i])) {
                if (!map.get(p[i]).equals(s1[i])) {
                    return false;
                }
            } else
                return false;
        }
        return true;
    }
}