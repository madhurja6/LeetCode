class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int finalVal=0;
        for(String i: operations){
            if (i .equals("X++") || i .equals("++X")) finalVal++;
            if (i .equals("X--") || i .equals("--X")) finalVal--;
        }
        return finalVal;
    }
}