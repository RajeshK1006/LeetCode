class Solution(object):
    def isArraySpecial(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if(len(nums)<=1):
            return True
        for i in range(len(nums)-1):
            first = nums[i]
            second = nums[i+1]

            if(first %2==0 and second %2!=0) or (first%2!=0 and second %2==0) :
                continue
            else:
                return False
        return True
        