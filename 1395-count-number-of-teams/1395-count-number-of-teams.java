class Solution {
 public static int numTeams(int[] rating) {
        int team=0;
        if (rating.length<3){
            return 0;
        } else {
            for (int i = 0; i < rating.length; i++) {
                for (int j = i + 1; j < rating.length; j++) {
                    for (int k = j + 1; k < rating.length; k++) {
                        if (rating[i] < rating[j] && rating[j] < rating[k] || rating[i] > rating[j] && rating[j] > rating[k]) {
                            team++;
                        }
                    }
                }
            }
        }
        return team;
    }
}