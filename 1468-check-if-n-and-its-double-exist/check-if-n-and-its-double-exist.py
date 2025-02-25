class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        mapp = {}
        for i in range(len(arr)):
            if arr[i] * 2 in mapp or arr[i]/2 in mapp:
                return True
            else:
                mapp[arr[i]]= i
        return False