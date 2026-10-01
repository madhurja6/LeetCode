class Solution {
    public int maxNumberOfBalloons(String text) {
        String s = "balloon";
        int arr[] = new int[26];
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a']++;
        }
        int cnt = 0;
        while (true) {
            int flag = 0;
            for (int i = 0; i < s.length(); i++) {
                if (arr[s.charAt(i) - 'a'] > 0)
                    arr[s.charAt(i) - 'a']--;
                else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                cnt++;
            else
                break;
        }
        return cnt;
    }
}