class Solution {
    public static String reverseWords(String s) {
        StringBuilder sb1=new StringBuilder();
        s=s.trim();
        StringBuilder sb2=new StringBuilder(s);
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)==' ' && s.charAt(i+1)==' '){
                sb2.deleteCharAt(i+1);
                s=sb2.toString();
                i--;
            }
        }
        while (s.contains(" ")) {
            int last = s.lastIndexOf(" ");
            sb1.append(s.substring(last));
            s=s.substring(0,last);
        }
        return sb1.append(" ").append(s).toString().trim();
    }
}