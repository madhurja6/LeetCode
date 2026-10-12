class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int index = 0;
        for (int i = 0; i <= n - k; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> {
                int freqCompare = b.getValue().compareTo(a.getValue());
                if (freqCompare == 0)
                    return b.getKey().compareTo(a.getKey());
                return freqCompare;
            });
            int sum = 0;
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                sum += list.get(j).getKey() * list.get(j).getValue();
            }
            ans[index++] = sum;
        }
        return ans;
    }
}