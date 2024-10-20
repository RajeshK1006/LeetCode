
# recurrsive approach to find the number of digits in an given number 
def count(n):
  if n==0:
    return 0

  return 1 + count(n//10)

print(count(n))
