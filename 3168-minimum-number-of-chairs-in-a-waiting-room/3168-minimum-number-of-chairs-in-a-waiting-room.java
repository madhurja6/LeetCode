class Solution {
    public static int minimumChairs(String s) {
        int entry=0;
        int minchair=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='E') entry++;
            minchair=Math.max(minchair,entry);
            if (ch=='L') entry--;
        }
        return minchair;
    }
}