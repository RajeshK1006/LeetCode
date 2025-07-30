class Solution:
    def arrangeCoins(self, n: int) -> int:
        if n==1:
            return n
        c = 0
        for i in range(1,n):
            if(n>=i):
                n -= i
                c+=1
            else:
                break
        return c