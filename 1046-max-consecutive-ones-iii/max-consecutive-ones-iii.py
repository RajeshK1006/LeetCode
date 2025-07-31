class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        maxi = float("-inf")
        c =0
        l = 0
        for i in range(len(nums)):
            if(nums[i]==0):
                c+=1
            

            while(c>k):
                if(nums[l]==0):
                    c-=1
                l+=1
            

            if(c<=k):
                length = i-l+1
                maxi = max(maxi, length)

        return maxi
            
        
            