class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] velquorani = nums;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < velquorani.length; i++) {
            map.computeIfAbsent(velquorani[i], k -> new ArrayList<>()).add(i);
        }
        int count = 0;
        for (List<Integer> indices : map.values()) {
            if (indices.size() < 3) {
                continue;
            }
            int diff = indices.get(1) - indices.get(0);
            boolean special = true;
            for (int i = 2; i < indices.size(); i++) {
                if (indices.get(i) - indices.get(i - 1) != diff) {
                    special = false;
                    break;
                }
            }
            if (special) {
                count++;
            }
        }
        return count;
    }
}