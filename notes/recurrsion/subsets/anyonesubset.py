def takenottake(arr, index,summ,k,l,ans):
    if index>=len(arr):
        if sum(l.copy()) == k:
            ans.append(l.copy())
            return True
        else:
            
            return False
    l.append(arr[index])
    summ+=arr[index]
    if takenottake(arr,index+1,summ,k,l,ans) == True:
        return True
    
    l.pop()
    summ-=arr[index]
    if takenottake(arr,index+1,summ,k,l,ans) == True:
        return True
    
    

def subsetsumm(arr,k):
    ans = []
    summ = 0
    l = []
    takenottake(arr, 0,summ,k,l,ans)
    return ans
    
print(subsetsumm([1,2,3,4,5],5))
    