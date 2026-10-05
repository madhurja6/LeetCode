class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] texts = text.split(" ");
        int[] brletter = new int[26];
        for (int i = 0; i < brokenLetters.length(); i++) {
            brletter[brokenLetters.charAt(i) - 'a']++;
        }
        int count = 0;
        for (String s : texts) {
            boolean tik = false;
            for (int i = 0; i < s.length(); i++) {
                if (brletter[s.charAt(i) - 'a'] > 0) {
                    tik = true;
                    break;
                }
            }
            if (!tik)
                count++;
        }
        return count;
    }
}