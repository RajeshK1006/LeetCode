class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        cnt = 0
        for i in range(len(nums)):
            if nums[i] > nums[(i+1)%len(nums)]:
                cnt +=1

            if cnt >1:
                return False
        return True 
        