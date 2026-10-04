class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() > sentence2.length()) return areSentencesSimilar(sentence2, sentence1);
        int start = 0;
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int end1 = s1.length - 1;
        int end2 = s2.length - 1;
        while (start <= end1 && s1[start].equals(s2[start])) {
            start++;
        }
        while (start <= end1 && s1[end1].equals(s2[end2])) {
            end1--;
            end2--;
        }
        return start > end1;
    }
}