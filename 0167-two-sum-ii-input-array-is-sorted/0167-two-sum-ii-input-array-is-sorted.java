class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] x = {-1, -1};
        int i = 0, j = numbers.length-1;
        while (j > i) {
            int sum=numbers[i] + numbers[j];
            if (sum == target) {
                x[0] = i + 1;
                x[1] = j + 1;
                break;
            }
            else if (sum>target) {
                j--;
            }
            else
                i++;
        }
        return x;
}
}