class Solution {
    public int maxDistinct(String s) {
        char ch[] = s.toCharArray();
        int arr[] = new int[26];
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (arr[ch[i] - 'a'] == 0) {
                arr[ch[i] - 'a']++;
                count++;
                if (count == 26)
                    return 26;
            }
        }
        return count;
    }
}