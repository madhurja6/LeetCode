class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
        int a = 0;
        for (String s : timePoints) {
            int h = Integer.parseInt(s.substring(0, 2));
            int m = Integer.parseInt(s.substring(3, 5));
            int minutes = h * 60 + m;
            times[a++] = minutes;
        }
        Arrays.sort(times);
        int mintime = Integer.MAX_VALUE;
        for (int i = 0; i < times.length - 1; i++) {
            int min = times[i + 1] - times[i];
            mintime = Math.min(mintime, min);
        }
        int dif = 1440 - times[times.length - 1] + times[0];  
        mintime = Math.min(mintime, dif);    
        return mintime;  
   }   
}