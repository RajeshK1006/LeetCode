class Solution:
    def maxArea(self, nums: List[int]) -> int:
        l = 0
        r = len(nums) -1
        maxi = 0
        while l<r:
            w = r -l
            h = min(nums[l], nums[r])
            area = w * h
            maxi = max(maxi,area)

            if(nums[l]<nums[r]):
                l+=1
            else:
                r -= 1
        return maxi


                
