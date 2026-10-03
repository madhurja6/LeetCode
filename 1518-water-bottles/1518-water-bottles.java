class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkable = numBottles;
        int mod = 0;
        while (numBottles >= numExchange) {
            mod = (numBottles % numExchange);
            numBottles /= numExchange;
            drinkable += numBottles;
            numBottles += mod;
        }
        return drinkable;
    }
}