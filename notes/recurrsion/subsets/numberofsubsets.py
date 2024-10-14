# given an array with l and r index the number of subsequences between the index l and r is 2**(r-l) 


class Solution:
    def numSubseq(self, nums: List[int], target: int) -> int:
        nums.sort()
        l = 0
        r  = len(nums)-1
        mod = 10**9 + 7 
        c = 0 
        while l<=r:
            if nums[l]+nums[r]<=target:
                c +=  1<< (r-l)

                l+=1
            else:
                r-=1

        return c % mod     
