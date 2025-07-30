class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:

        return self.lastIndex(letters,target)
        
    def lastIndex(self,arr,target):
        l = 0
        r = len(arr) -1
        ans= arr[0]
        while(l<=r):
            mid = (l+r)//2
            if arr[mid] > target:
                ans = arr[mid]
                r = mid -1
            else:
                l = mid +1
        return ans