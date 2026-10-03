class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nX = Math.max(x1, Math.min(xCenter, x2));
        int nY = Math.max(y1, Math.min(yCenter, y2));

        int diffX = xCenter - nX;
        int diffY = yCenter - nY;

        return diffX * diffX + diffY * diffY <= radius * radius;
    }
}