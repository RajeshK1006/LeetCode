class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        l =0
        r = 0
        c = 0

        while(l< len(g) and r < len(s)):
            if g[l]<=s[r]:
                l+=1
                c+=1
            r+=1
        return c
        

