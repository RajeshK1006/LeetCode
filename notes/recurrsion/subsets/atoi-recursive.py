def recurs(s,id,res):
    if id>=len(s):
        return res
    
    if s[id].isdigit():
        res = res*10 + int(s[id])
    else:
        return res
    
    return recurs(s,id+1,res)
    
    
def atoi(s):
    res= 0 
    id = 0
    return recurs(s,id,res)
    
print(atoi("97687687"))
    
    
    
    
    
