def takenottake(arr, index,summ,k):
    if index>=len(arr):
        if summ == k:
            return 1
        else:
            
            return 0
    summ+=arr[index]
    l  =  takenottake(arr,index+1,summ,k)
    summ-=arr[index]
    r = takenottake(arr,index+1,summ,k)
    return l+r
    
    

def subsetsumm(arr,k):
    summ = 0

    return takenottake(arr, 0,summ,k)
    
print(subsetsumm([1,2,3,4,5],5))
    
