# Bit Manipulation

## Binary Addition 

    
    Example:

       0 1 0 1
    +  0 1 1 1
      ---------
       1 1 0 0

- If we get **1** as the result after adding bits in the same place, of two binary numbers, then put **1** as the result at that place. ( Because **1** in binary is **0 1**)

- If we get **2** as the result after adding bits in the same place, of two binary numbers, then put **1** as the reminder & **0** as the result at that place. ( Because **2** in binary is **1 0** )

- If we get **3** as the result after adding bits in the same place, of two binary numbers, then put **1** as the reminder & **1** as the result. ( Because **3** in binary is **1 1** )


## Binary Subtraction

    Example:

        1 1 0 0
    -   0 1 0 1
       ---------
        0 1 1 1

- In binary subtraction negative of second number is added to the first number.

- To get the negative of a binary number we find the **2's Complement** of that number. ( here, the second number )

    - ### Finding 2's Complement

        1. Invert all bits. That is ...0 0 0 **1 0 1** becomes ...1 1 1 **0 1 0**

        2. Add one to it ( Binary Addition ). So it becomes ...1 1 1 **0 1 1**

- Now add this binary number to the first number to get the result.