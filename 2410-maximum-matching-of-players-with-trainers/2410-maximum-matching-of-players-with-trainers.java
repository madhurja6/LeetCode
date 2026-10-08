class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        int j = 0;
        for (int i :players) {
            while (j < trainers.length) {
                if (i <= trainers[j]) {
                    count++;
                    j++;
                    break;
                } else {
                    j++;
                }
            }
            if (j == trainers.length) break;
        }
        return count;
    }
}