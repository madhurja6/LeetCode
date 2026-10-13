class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (!set.contains(i))
                set.add(i);
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        for (int i = min; i < max; i++) {
            if (!set.contains(i))
                list.add(i);
        }
        return list;
    }
}