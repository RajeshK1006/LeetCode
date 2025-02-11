class Solution:
    def removeOccurrences(self, s: str, part: str) -> str:
        while part in s:
            pindex = s.find(part)

            s = s[:pindex] + s[pindex+len(part):]
        return s