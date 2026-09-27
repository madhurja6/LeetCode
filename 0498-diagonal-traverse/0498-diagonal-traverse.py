class Solution(object):
    def findDiagonalOrder(self, mat):
        n = len(mat)
        if n == 0:
            return []
        if n == 1:
            return mat[0]
        m = len(mat[0])
        ans = []
        i, j = 0, 0
        ans.append(mat[i][j])
        while i < n - 1 and j < m:
            if j + 1 <= m - 1:
                j += 1
                ans.append(mat[i][j])
            else:
                i += 1
                ans.append(mat[i][j])
            while j >= 1 and i < n - 1:
                i += 1
                j -= 1
                ans.append(mat[i][j])
            if len(ans) == m * n:
                break
            if i + 1 <= n - 1:
                i += 1
                ans.append(mat[i][j])
            else:
                j += 1
                ans.append(mat[i][j])
            while i > 0 and j < m - 1:
                i -= 1
                j += 1
                ans.append(mat[i][j])
        return ans
