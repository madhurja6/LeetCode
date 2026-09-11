class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || digits[i] == 0)
                    continue;
                for (int j2 = 0; j2 < n; j2++) {
                    if (j == j2 || i == j2)
                        continue;
                    if (digits[j2] % 2 == 0)
                        set.add((digits[i] * 100) + (digits[j] * 10) + (digits[j2]));
                }
            }
        }
        return set.size();
    }
}