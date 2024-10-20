Trigonometric and angular functions are discussed in this article.

1. sin() :- This function returns the sine of value passed as argument. The value passed in this function should be in radians.

2. cos() :- This function returns the cosine of value passed as argument. The value passed in this function should be in radians.




# Python code to demonstrate the working of 
# sin() and cos() 
   
# importing "math" for mathematical operations 
import math 
  
a = math.pi/6
   
# returning the value of sine of pi/6 
print ("The value of sine of pi/6 is : ", end="") 
print (math.sin(a)) 
   
# returning the value of cosine of pi/6 
print ("The value of cosine of pi/6 is : ", end="") 
print (math.cos(a)) 
Output:

The value of sine of pi/6 is : 0.49999999999999994
The value of cosine of pi/6 is : 0.8660254037844387
3. tan() :- This function returns the tangent of value passed as argument. The value passed in this function should be in radians.

4. hypot(a, b) :- This returns the hypotenuse of the values passed in arguments. Numerically, it returns the value of sqrt(a*a + b*b).




# Python code to demonstrate the working of 
# tan() and hypot() 
   
# importing "math" for mathematical operations 
import math 
  
a = math.pi/6
b = 3
c = 4
   
# returning the value of tangent of pi/6 
print ("The value of tangent of pi/6 is : ", end="") 
print (math.tan(a)) 
   
# returning the value of hypotenuse of 3 and 4 
print ("The value of hypotenuse of 3 and 4 is : ", end="") 
print (math.hypot(b,c)) 
Output:

The value of tangent of pi/6 is : 0.5773502691896257
The value of hypotenuse of 3 and 4 is : 5.0
5. degrees() :- This function is used to convert argument value from radians to degrees.

6. radians() :- This function is used to convert argument value from degrees to radians.




# Python code to demonstrate the working of 
# degrees() and radians() 
   
# importing "math" for mathematical operations 
import math 
   
a = math.pi/6
b = 30
  
# returning the converted value from radians to degrees 
print ("The converted value from radians to degrees is : ", end="") 
print (math.degrees(a)) 
   
# returning the converted value from degrees to radians 
print ("The converted value from degrees to radians is : ", end="") 
print (math.radians(b)) 
Output:

The converted value from radians to degrees is : 29.999999999999996
The converted value from degrees to radians is : 0.5235987755982988
