class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while (i<len1 && i<len2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if(i==len1){
            String s=word2.substring(i);
            sb.append(s);
        }
        if (i==len2){
            String s=word1.substring(i);
            sb.append(s);
        }
        return sb.toString();
    }
}