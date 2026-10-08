class Solution {
    public long putMarbles(int[] weights, int k) {
        if (k == 1) {
            return 0;
        }
        int n = weights.length - 1;
        List<Integer> pairSums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pairSums.add(weights[i] + weights[i + 1]);
        }
        Collections.sort(pairSums);
        long minScore = 0, maxScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairSums.get(i);
            maxScore += pairSums.get(pairSums.size() - 1 - i);
        }
        return maxScore - minScore;
    }
}