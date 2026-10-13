class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            int x = list.get(i);
            for (int j = i + 1; j < n; j++) {
                int y = list.get(j);
                if (!map.get(x).equals(map.get(y))) {
                    return new int[] { x, y };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}