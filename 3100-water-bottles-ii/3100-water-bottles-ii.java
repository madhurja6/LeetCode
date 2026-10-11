class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int maxDrunk = numBottles;
        while (numBottles >= numExchange) {
            maxDrunk += 1;
            numBottles-=numExchange;
            numBottles++;
            numExchange++;
        }
        return maxDrunk;
    }
}