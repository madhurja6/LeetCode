class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        int maxodd = -1;
        int mineven = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                if (arr[i] % 2 != 0) {
                    maxodd = Math.max(maxodd, arr[i]);
                } else {
                    mineven = Math.min(mineven, arr[i]);
                }
            }
        }
        if (mineven == Integer.MAX_VALUE || maxodd == -1) {
            return -1;
        }
        return maxodd - mineven;
    }
}