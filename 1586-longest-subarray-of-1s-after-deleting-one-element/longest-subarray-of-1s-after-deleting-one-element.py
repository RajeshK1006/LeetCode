class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        c =0
        l = 0
        maxi = 0
        for i in range(len(nums)):
            if(nums[i]==0):
                c+=1

            
            
            if(c>1):
                if(nums[l]==0):
                    c-=1
                l+=1
            
            if(c<=1):
                length = i-l+1
                maxi = max(length,maxi)


        return maxi -1



        
            