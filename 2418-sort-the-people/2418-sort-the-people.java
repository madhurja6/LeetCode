class Solution {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] sorted = new String[names.length];
        int len = heights.length - 1;
        int i=0;
        while (len >= 0) {
            sorted[i] = map.get(heights[len]);
            len--;
            i++;
        }
        return sorted;
    }
}