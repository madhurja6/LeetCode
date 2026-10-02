class Solution {
    public static int maximum69Number(int num) {
        int d = numofdig(num);
        int ans = num;
        int arr[] = new int[d];
        int n = num;
        int c = d;
        while (n != 0) {
            arr[--c] = n % 10;
            n /= 10;
        }
        int brr[] = Arrays.copyOf(arr, d);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                brr[i] = 9;
                ans = Math.max(ans, make(brr, brr.length - 1, 0));
            }
            else{
                brr[i] = 6;
                ans = Math.max(ans, make(brr, brr.length - 1, 0));
            }
            brr = Arrays.copyOf(arr, d);
        }
        return ans;
    }

    private static int make(int[] brr, int d, int i) {
        if (i == brr.length)
            return 0;
        return (int) Math.pow(10, d) * brr[i] + make(brr, d - 1, i + 1);
    }

    private static int numofdig(int num) {
        if (num == 0)
            return 0;
        return 1 + numofdig(num / 10);
    }
}