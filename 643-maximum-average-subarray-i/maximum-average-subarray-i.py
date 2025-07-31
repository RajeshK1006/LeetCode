class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        maxi = float("-inf")
        l = 0
        summ = 0
        for i in range(len(nums)):
            summ+=nums[i]

            
            
            if(i-l+1>k):
                summ-=nums[l]
                l+=1
            if(i-l+1==k):
                maxi = max(maxi,summ)

        return maxi/k