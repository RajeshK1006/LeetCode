class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxi = 0
        l = 0
        mapp = {}
        for i in range(len(s)):
            if s[i] in mapp:
                l = max(l,mapp[s[i]]+1)
            
            mapp[s[i]] = i

            length= i-l+1
            maxi = max(length,maxi)
        return maxi

            

            
            
        
        