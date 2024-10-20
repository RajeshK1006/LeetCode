
# recurrsive approach to find the number of digits in an given number 
def count(n):
  if n==0:
    return 0

  return 1 + count(n//10)

print(count(n))


# logrithmic approach for this problem 

# log base x ,y = z 

return int(math.log10(n)+1)
