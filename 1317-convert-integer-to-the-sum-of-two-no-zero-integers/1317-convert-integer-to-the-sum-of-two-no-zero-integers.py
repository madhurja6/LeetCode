class Solution(object):
    def getNoZeroIntegers(self, n):
        def isZero(x):
            while x > 0:
                if x % 10 == 0:
                    return True
                x //= 10
            return False

        for i in range(1, n):
            if not isZero(i) and not isZero(n - i):
                return [i, n - i]
        return []
