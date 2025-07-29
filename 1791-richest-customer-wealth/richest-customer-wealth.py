class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        maxi = 0
        for i in range(len(accounts)):
            summ = sum(accounts[i])
            maxi = max(maxi,summ)
        return maxi
        