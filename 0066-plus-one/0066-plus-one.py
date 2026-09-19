class Solution(object):
    def plusOne(self, digits):
        num = self.make(digits, len(digits) - 1, 0)
        print(num)
        num += 1
        print(num)
        d = self.numofdig(num)
        b = [0] * d
        c = d
        while num != 0:
            c -= 1
            b[c] = num % 10
            num //= 10
        return b

    def make(self, brr, d, i):
        if i == len(brr):
            return 0
        return (10 ** d) * brr[i] + self.make(brr, d - 1, i + 1)

    def numofdig(self, num):
        if num == 0:
            return 0
        return 1 + self.numofdig(num // 10)
