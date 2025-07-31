class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l = 0
        maxi = float("inf")
        summ =0
        for i in range(len(nums)):
            summ += nums[i]

            while(summ >= target):
                length = i-l+1
                maxi = min(length,maxi)
                summ -= nums[l]
                l+=1
            
        if maxi==float("inf"):
            return 0
        return maxi