def pow(n):
    if n==1 or n==2:
        return True
    elif n>2:
        return pow(n/2)
    else:
        return False
    
    

print(pow(16))
