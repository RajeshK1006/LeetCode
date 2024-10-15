class Solution:
    def tnt(self,arr, index, n, l,k,ans):
        if k<0 or index>=n:
            return 
        if k==0:
            ans.append(l.copy())
            return 
        
        l.append(arr[index])
        self.tnt(arr,index,n,l,k-arr[index],ans)
        l.pop()
        self.tnt(arr,index+1,n,l,k,ans)



    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = []
        l = []
        n = len(candidates)
        index = 0

        self.tnt(candidates,index,n,l,target,ans)

        return ans
        
