
class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        mapp = {}
        for i in range(len(nums)):
            if nums[i] not in mapp:
                mapp[nums[i]] = i
            else:
                if abs(i - mapp[nums[i]])<=k:
                    return True
                else:
                    mapp[nums[i]] = i
        return False
        