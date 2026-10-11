class Solution {
    public long flowerGame(int n, int m) {
        long oddsInN = (n + 1) / 2;
        long evenInM = m / 2;

        long evenInN = n / 2;
        long oddsInM = (m + 1) / 2;

        return (oddsInN * evenInM) + (evenInN * oddsInM);
    }
}