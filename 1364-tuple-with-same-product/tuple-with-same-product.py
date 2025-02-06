class Solution(object):
    def tupleSameProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        mapp = {}
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                p = nums[i] * nums[j]

                if p in mapp:
                    mapp[p] += 1
                else:
                    mapp[p] = 1
        
        t= 0 
        for k,v in mapp.items():
            p_r = ((v-1)*(v))//2
            t += 8*p_r
        
        return t