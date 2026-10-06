class Solution {
    public int numberOfBeams(String[] bank) {
        int prevcount = count(bank[0]);
        int sum = 0;
        for (int i = 1; i < bank.length; i++) {
            int prescount = count(bank[i]);
            if (prescount > 0) {
                sum += prescount * prevcount;
                prevcount = prescount;
            }
        }
        return sum;
    }

    private int count(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1')
                count++;
        }
        return count;
    }
}