class Solution {
    public boolean canAliceWin(int n) {
        int canPick = 10;
        int turn = 0;
        while (n > 0) {
            if (n - canPick >= 0) {
                n -= canPick--;
                turn++;
            } else
                break;
        }
        return turn % 2 != 0;
    }
}