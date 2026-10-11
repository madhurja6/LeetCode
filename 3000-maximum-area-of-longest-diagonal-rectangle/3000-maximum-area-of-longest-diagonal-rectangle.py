class Solution(object):
    def areaOfMaxDiagonal(self, dimensions):
        prevMaxVal = (dimensions[0][0] ** 2 + dimensions[0][1] ** 2) ** 0.5
        ans = dimensions[0][0] * dimensions[0][1]

        for i in range(1, len(dimensions)):
            currentVal = (dimensions[i][0] ** 2 + dimensions[i][1] ** 2) ** 0.5
            currentArea = dimensions[i][0] * dimensions[i][1]

            if currentVal > prevMaxVal:
                ans = currentArea
                prevMaxVal = currentVal
            elif currentVal == prevMaxVal and currentArea > ans:
                ans = currentArea

        return ans
