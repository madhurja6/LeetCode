class Solution {
public:
    int minimumArea(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        // find top row (first row containing 1)
        while (top < n && all_of(grid[top].begin(), grid[top].end(), [](int x){ return x == 0; })) {
            top++;
        }

        // find bottom row (last row containing 1)
        while (bottom >= 0 && all_of(grid[bottom].begin(), grid[bottom].end(), [](int x){ return x == 0; })) {
            bottom--;
        }

        // find left column (first column containing 1)
        while (left < m && isColZero(grid, left)) {
            left++;
        }

        // find right column (last column containing 1)
        while (right >= 0 && isColZero(grid, right)) {
            right--;
        }

        int height = bottom - top + 1;
        int width = right - left + 1;

        if (height <= 0 || width <= 0) return 0;
        return height * width;
    }

private:
    bool isColZero(vector<vector<int>>& grid, int col) {
        for (int i = 0; i < grid.size(); i++) {
            if (grid[i][col] != 0) return false;
        }
        return true;
    }
};
