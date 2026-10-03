class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : salary) {
            sum += i;
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        sum -= (min + max);
        return (double) sum / (salary.length - 2);
    }
}