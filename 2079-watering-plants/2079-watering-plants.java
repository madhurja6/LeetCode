class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int remain=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=remain) {
                steps+=1;
                remain-=plants[i];
            }
            else if(plants[i]>remain){
                steps+=i;
                remain=capacity;
                steps+=i+1;
                remain-=plants[i];
            }
        }
        return steps;
    }
}