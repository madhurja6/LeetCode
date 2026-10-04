class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            if (check(allowed, word)) count++;
        }
        return count;
    }

    private static boolean check(String allow, String word) {
        for (char c : word.toCharArray()) {  
        if (allow.indexOf(c) == -1) {  
            return false;  
        }  
    }  
    return true;
    }
}