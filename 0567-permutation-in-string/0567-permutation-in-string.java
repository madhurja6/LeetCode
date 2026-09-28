class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(s1.charAt(i) - 'a', map1.getOrDefault(s1.charAt(i) - 'a', 0) + 1);
            map2.put(s2.charAt(i) - 'a', map2.getOrDefault(s2.charAt(i) - 'a', 0) + 1);
        }
        if (isSame(map1, map2)) return true;
        for (int i = n; i < m; i++) {
            map2.put(s2.charAt(i) - 'a', map2.getOrDefault(s2.charAt(i) - 'a', 0) + 1);
            map2.put(s2.charAt(i - n) - 'a', map2.get(s2.charAt(i - n) - 'a') - 1);
            if (map2.get(s2.charAt(i - n) - 'a') == 0) {
                map2.remove(s2.charAt(i - n) - 'a');
            }
            if (isSame(map1, map2)) return true;
        }
        return false;
    }
    private static boolean isSame(HashMap<Integer, Integer> map1, HashMap<Integer, Integer> map2) {
        return map1.equals(map2);
    }
}