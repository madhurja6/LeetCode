class Solution {
    public static int scoreOfString(String s) {
        int score=0,scoreNxt=0;
        int i=0;
        while (i<s.length()-1){
            scoreNxt=s.charAt(i)-s.charAt(i+1);
            if (scoreNxt<0) scoreNxt*=-1;
            score+=scoreNxt;
            i++;
        }
        return score;
    }
}