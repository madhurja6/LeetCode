class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            set.add(rev(i));
        }
        return set.size();
    }
    private static int rev(int n) {
        if (n == 0) {
            return n;
        }
        int dig = digit(n);
        return n % 10 * (int) Math.pow(10, dig-1) + rev(n / 10);
    }

    private static int digit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + digit(n / 10);
    }
}