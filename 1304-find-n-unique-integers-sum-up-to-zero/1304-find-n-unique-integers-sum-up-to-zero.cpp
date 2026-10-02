class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int> ans(n);
        int odd = (n % 2 != 0) ? 1 : 0;
        int key = 1;
        int i = 0;
        for (; i < n - odd; i++) {
            ans[i++] = key;
            ans[i] = -key;
            key++;
        }
        return ans;
    }
};
