class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long res = 0;
        int n = skill.length;
        int targetSum = skill[0] + skill[n - 1];
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            if (skill[i] + skill[j] != targetSum) {
                return -1;
            }
            res += ((long) skill[i] * skill[j]);
        }
        return res;
    }
}