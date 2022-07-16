# ClassBox

You are given a geometric figure Box with fields length, width, and height. Model a class Box that can be instantiated by the same three parameters. Expose to the outside world only methods for its surface area, lateral surface area, and its volume (formulas: http://www.mathwords.com/r/rectangular_parallelepiped.htm).

On the first three lines, you will get the length, width, and height. On the next three lines print the surface area, lateral surface area, and the volume of the box.
A box’s side should not be zero or a negative number. Add data validation for each parameter given to the constructor. Make a private setter that performs data validation internally.

Input:

       2 
       -3
       4
       
Output:

       Width cannot be zero or negative.
       
 Input:

       2
       3
       4
       
Output:

       Surface Area - 52.00
       Lateral Surface Area - 40.00
       Volume – 24.00
 
Input:
     
     1.3
     1
     6

Output:

     Surface Area - 30.20
     Lateral Surface Area - 27.60
     Volume - 7.80

