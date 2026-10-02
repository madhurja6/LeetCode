class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        freq.sort(null);
        int rem = 0;
        int half = arr.length / 2;
        int count = 0;
        for (int i = freq.size() - 1; i >= 0; i--) {
            rem += freq.get(i);
            count++;
            if (rem >= half)
                return count;
        }
        return count;
    }
}